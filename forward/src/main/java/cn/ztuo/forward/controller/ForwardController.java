package cn.ztuo.forward.controller;

import cn.hutool.core.codec.Base64Decoder;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.resource.MultiFileResource;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author steven
 * @date 2022-12-03 20:32
 */
@Slf4j
@RestController
@RequestMapping("/api")
public class ForwardController {

    @Value("${service.url}")
    String serviceUrl;

    static Map<String,String> recognitionTypeMap = new HashMap<>();

    static{
        recognitionTypeMap.put("Fire","明火");
        recognitionTypeMap.put("Smoke","明烟");
        recognitionTypeMap.put("NoHelmet","无安全帽");
        recognitionTypeMap.put("Calling","打电话");
        recognitionTypeMap.put("Smoking","抽烟");
        recognitionTypeMap.put("StaffAway","人员缺岗");
        recognitionTypeMap.put("NoVest","未穿反光衣");
        recognitionTypeMap.put("Intrude","人员入侵");
        recognitionTypeMap.put("TouchFence","翻越围栏");
        recognitionTypeMap.put("NoSuite","未穿工作服");
        recognitionTypeMap.put("Falldown","人员倒地");
    }

    /**
     * 接收告警事件上报
     * {
     * 	"Addition": null,
     * 	"AlarmId": "2567E6F7-9C99-4C5F-B591-47A93248896A",
     * 	"BoardId": "RJ-BOX3-2228B91DEDF8C625E874088D282555AC",
     * 	"BoardIp": "192.168.0.133", 盒子网络地址
     *  "Id":1,
     *  "ImageData":"/9jxxxxxxxxx",
     * 	"GPS": {
     * 		"available": false,
     * 		"kSpeed": 0.0,
     * 		"latitude": 0.0,
     * 		"longitude": 0.0,
     * 		"nSpeed": 0.0
     *        },
     * 	"Media": {
     * 		"GBTransport": false,
     * 		"MediaDesc": "",
     * 		"MediaHeight": 1080,
     * 		"MediaName": "1",
     * 		"MediaUrl": "rtsp://192.168.0.250:8556/smoking",
     * 		"MediaWidth": 1920,
     * 		"RtspTransport": false
     *    },
     * 	"Result": {
     * 		"NoHelmet": true,
     * 		"RegType": "Rectangle",
     * 		"RelativeBox": [
     * 			0.29531249403953552,
     * 			0.51249998807907104,
     * 			0.12187500298023224,
     * 			0.46944445371627808
     * 		],
     * 		"Type": "NoHelmet"
     *    },
     * 	"Summary": "NoHelmet",
     * 	"TaskDesc": "",
     * 	"TaskSession": "1",
     * 	"Time": "2022-10-17 15:55:57",
     * 	"TimeStamp": 1665993357058546,
     * 	"Type": 0,
     * 	"VideoFile": ""
     * }
     *
     */
    @PostMapping("/event")
    public String receiveEvent(@RequestBody Map<String,Object> paramMap){
        log.info("receiveEvent Time={}",paramMap.get("Time"));
        log.info("receiveEvent BoardIp={}",paramMap.get("BoardIp"));
        log.info("receiveEvent Media={}",paramMap.get("Media"));
        log.info("receiveEvent Summary={}",paramMap.get("Summary"));
        // 解析参数
        Map<String,Object> requestParam = new HashMap<>(6);
        // 时间
        requestParam.put("datetime", String.valueOf(paramMap.get("Time")));
        // 报警设备IP
        requestParam.put("ipV4", String.valueOf(paramMap.get("BoardIp")));
        // 报警触发通道号
        Object channelObj = JSONUtil.parseObj(paramMap.get("Media")).get("MediaName");
        requestParam.put("channel", String.valueOf(channelObj));
        // 违规行为
        String summary = String.valueOf(paramMap.get("Summary"));
        String recognitionType = recognitionTypeMap.get(summary);
        requestParam.put("recognitionType", recognitionType==null?summary:recognitionType);
        // 报警图
        if(null == paramMap.get("ImageData")){
            return "FAIL1";
        }
        String imageData = String.valueOf(paramMap.get("ImageData"));
        File imageDataFile = new File(RandomUtil.randomNumbers(7)+".jpg");
        requestParam.put("ISAPIPic_0.jpg", picToResource(imageData,imageDataFile));
        // 抓拍图
        File imageDataLabeledFile = new File(RandomUtil.randomNumbers(8)+".jpg");
        if(null == paramMap.get("ImageDataLabeled")){
            requestParam.put("ISAPIPic_1.jpg",imageDataFile);
        }else{
            String imageDataLabeled = String.valueOf(paramMap.get("ImageDataLabeled"));
            requestParam.put("ISAPIPic_1.jpg",picToResource(imageDataLabeled,imageDataLabeledFile));
        }
        // 信息转发
        sendEvent(requestParam);
        // 删除临时文件
        imageDataFile.delete();
        imageDataLabeledFile.delete();
        return "SUCCESS";
    }

    public void sendEvent(Map<String,Object> paramMap){
        log.info("sendEvent url={}",serviceUrl);
        log.info("sendEvent paramMap={}",paramMap);
        String response = HttpUtil.post(serviceUrl, paramMap);
        log.info("sendEvent response={}",response);
    }

    private MultiFileResource picToResource(String imageData,File file){
        // base64解码
        byte[] imageBytes = Base64Decoder.decode(imageData);
        // 转File
        FileUtil.writeBytes(imageBytes, file);
        // 转MultiFileResource
        MultiFileResource resource = new MultiFileResource();
        resource.add(file);
        return resource;
    }

    /**
     * 模拟接收
     */
    @PostMapping("/AIAnalysis/add")
    public String testEvent(String datetime,
                            String ipV4,
                            String channel,
                            String recognitionType,
                            @RequestParam("ISAPIPic_0.jpg") MultipartFile pic0,
                            @RequestParam("ISAPIPic_1.jpg") MultipartFile pic1) throws IOException {
        log.info("testEvent datetime={}",datetime);
        log.info("testEvent ipV4={}",ipV4);
        log.info("testEvent channel={}",channel);
        log.info("testEvent recognitionType={}",recognitionType);
        log.info("testEvent pic0={}",pic0);
        log.info("testEvent pic1={}",pic1);
        // 保存图片
        File file0 = new File("/Users/steven/logs/0.jpg");
        FileUtil.writeBytes(pic0.getBytes(),file0);
        File file1 = new File("/Users/steven/logs/1.jpg");
        FileUtil.writeBytes(pic0.getBytes(),file1);
        return "SUCCESS";
    }

}
