package site.daishuyang.face;

import cn.hutool.core.codec.Base64Encoder;
import cn.hutool.core.io.IoUtil;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author steven
 * @date 2021-08-06 02:05
 */
@RestController
@RequestMapping()
public class FaceController {

    @Value("${ztuo.baidu.clientId}")
    private String clientId;

    @Value("${ztuo.baidu.clientSecret}")
    private String clientSecret;

    @RequestMapping(value = "check", method = RequestMethod.POST)
    public String check(@RequestBody FaceParam faceParam) {
        // 请求url
        String url = "https://aip.baidubce.com/rest/2.0/face/v1/faceliveness/verify";
        try {
            // 设置jsonBody参数
            Map<String, Object> param = new HashMap<>();
            param.put("video_base64", convertMP4ToBase64(faceParam.getVideo()));
            // 注意这里仅为了简化编码每一次请求都去获取access_token，线上环境access_token有过期时间， 客户端可自行缓存，过期后重新获取。
            String accessToken = getAuth();
            url = url + "?access_token=" + accessToken;
            String result = HttpUtil.post(url, param);
            JSONObject resultJson = JSONObject.parseObject(result);
            System.out.println(resultJson);
            return resultJson.toJSONString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Fail";
    }

    @RequestMapping(value = "verify", method = RequestMethod.POST)
    public String verify(@RequestBody FaceParam faceParam) {
        // 请求url
        String url = "https://aip.baidubce.com/rest/2.0/face/v3/match";
        try {
            // 设置jsonBody参数
            JSONArray array = new JSONArray();
            JSONObject param1 = new JSONObject();
            param1.put("image", faceParam.getImage1());
            param1.put("image_type", "URL");
            array.add(param1);
            JSONObject param2 = new JSONObject();
            param2.put("image", faceParam.getImage2());
            param2.put("image_type", "URL");
            array.add(param2);
            String jsonBody = JSONUtil.toJsonStr(array);
            // 注意这里仅为了简化编码每一次请求都去获取access_token，线上环境access_token有过期时间， 客户端可自行缓存，过期后重新获取。
            String accessToken = getAuth();
            url = url + "?access_token=" + accessToken;
            System.out.println(url);
            System.out.println(jsonBody);
            String result = HttpUtil.post(url, jsonBody);
            JSONObject resultJson = JSONObject.parseObject(result);
            System.out.println(resultJson);
            return resultJson.toJSONString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Fail";
    }

    /**
     * 获取权限token
     *
     * @return 返回示例：
     * {
     * "access_token": "24.460da4889caad24cccdb1fea17221975.2592000.1491995545.282335-1234567",
     * "expires_in": 2592000
     * }
     */
    public String getAuth() {
        return getAuth(clientId, clientSecret);
    }

    /**
     * 获取API访问token
     * 该token有一定的有效期，需要自行管理，当失效时需重新获取.
     *
     * @param ak - 百度云官网获取的 API Key
     * @param sk - 百度云官网获取的 Securet Key
     * @return assess_token 示例：
     * "24.460da4889caad24cccdb1fea17221975.2592000.1491995545.282335-1234567"
     */
    public String getAuth(String ak, String sk) {
        // 获取token地址
        String authHost = "https://aip.baidubce.com/oauth/2.0/token?";
        String getAccessTokenUrl = authHost
                // 1. grant_type为固定参数
                + "grant_type=client_credentials"
                // 2. 官网获取的 API Key
                + "&client_id=" + ak
                // 3. 官网获取的 Secret Key
                + "&client_secret=" + sk;
        try {
            URL realUrl = new URL(getAccessTokenUrl);
            // 打开和URL之间的连接
            HttpURLConnection connection = (HttpURLConnection) realUrl.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            // 获取所有响应头字段
            Map<String, List<String>> map = connection.getHeaderFields();
            // 遍历所有的响应头字段
            for (String key : map.keySet()) {
                System.err.println(key + "--->" + map.get(key));
            }
            // 定义 BufferedReader输入流来读取URL的响应
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = in.readLine()) != null) {
                sb.append(line);
            }
            // 返回结果示例
            String result = sb.toString();
            System.err.println("result:" + result);
            JSONObject jsonObject = JSONObject.parseObject(result);
            return jsonObject.getString("access_token");
        } catch (Exception e) {
            System.err.print("获取token失败！");
            e.printStackTrace(System.err);
        }
        return null;
    }

    private static String convertMP4ToBase64(String mp4Url) throws IOException {
        // 从URL读取MP4文件的InputStream
        InputStream inputStream = new URL(mp4Url).openStream();
        try {
            // 将InputStream转为字节数组
            byte[] mp4Bytes = IoUtil.readBytes(inputStream);
            // 将字节数组编码为Base64字符串
            return Base64Encoder.encode(mp4Bytes);
        } finally {
            // 关闭输入流
            IoUtil.close(inputStream);
        }
    }

}
