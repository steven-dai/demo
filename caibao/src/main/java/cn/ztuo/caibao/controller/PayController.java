package cn.ztuo.caibao.controller;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import cn.ztuo.caibao.param.*;
import cn.ztuo.caibao.util.PayUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Map;
import java.util.UUID;

/**
 * @author steven
 * @date 2022-06-11 14:34
 */
@Slf4j
@RestController
@RequestMapping("/pay")
public class PayController {

    private static final String key = "key";

    private static final String url = "https://openapi.caibaopay.com/gatewayOpen.htm";

    private static final String notify_url = "https://31y9665g22.oicp.vip/ztuo/pay/h5/callback";

    /**
     * 获取H5支付链接
     */
    @RequestMapping(value = "/h5",method = RequestMethod.GET)
    public String getH5PayLink(String amount,String subject,String remark){
        log.info("getH5PayLink param, amount={}, subject={}, remark={}",amount,subject,remark);
        H5PayRequestParam h5PayParam = new H5PayRequestParam();
        // 公共参数
        h5PayParam.setCommand("open.api.h5");
        setCommonRequestParam(h5PayParam);
        // H5支付参数
        h5PayParam.setLocal_order_no("order"+ RandomUtil.randomNumbers(10));
        h5PayParam.setAmount(amount);
        h5PayParam.setSubject(subject);
        h5PayParam.setRemark(remark);
        h5PayParam.setNotify_url(notify_url);
        // 生成签名
        Map<String,Object> params = JSONUtil.parseObj(h5PayParam);
        String sign = PayUtil.MD5Sign(params,key);
        params.put("sign",sign);
        log.info("h5 pay param:{}",params);
        // 获取支付链接
        String post = HttpUtil.post(url, params);
        JSONObject result = JSONUtil.parseObj(post);
        log.info("h5 pay result:{}",result);
        String payLink = result.getJSONObject("data").getStr("url");
        JSONObject json = new JSONObject();
        if (payLink!=null){
            json.putOnce("code",200);
            json.putOnce("msg","成功");
            json.putOnce("data",payLink);
        }else{
            json.putOnce("code",500);
            json.putOnce("msg",result.getJSONObject("result").getStr("error_msg"));
        }
        return json.toString();
    }

    @RequestMapping(value = "/h5/callback",method = RequestMethod.POST)
    public String h5PayCallback(H5PayCallbackParam callbackParam) {
        log.info("H5 pay callback param:{}",callbackParam);
        return "success";
    }

    @RequestMapping(value = "/h5/refund",method = RequestMethod.GET)
    public String h5PayRefund(String localOrderNo, String localRefundNo, String refundAmount,String reason) {
        log.info("h5PayRefund param, localOrderNo={}, localRefundNo={}, refundAmount={},reason={}"
                ,localOrderNo,localRefundNo,refundAmount,reason);
        H5PayRefundParam h5PayRefundParam = new H5PayRefundParam();
        // 公共参数
        h5PayRefundParam.setCommand("open.api.refund");
        setCommonRequestParam(h5PayRefundParam);
        // H5支付退款参数
        h5PayRefundParam.setLocal_order_no(localOrderNo);
        h5PayRefundParam.setLocal_refund_no(localRefundNo);
        if(refundAmount!=null){
            h5PayRefundParam.setRefund_amount(refundAmount);
        }
        if(reason!=null){
            h5PayRefundParam.setReason(reason);
        }
        // 生成签名
        Map<String,Object> params = JSONUtil.parseObj(h5PayRefundParam);
        String sign = PayUtil.MD5Sign(params,key);
        params.put("sign",sign);
        // 获取支付链接
        log.info("h5 pay refund param:{}",params);
        String post = HttpUtil.post(url, params);
        JSONObject result = JSONUtil.parseObj(post);
        log.info("h5 pay refund result:{}",result);
        return result.toString();
    }

    private void setCommonRequestParam(CommonRequestParam requestParam){
        // 公共参数
        requestParam.setApp("app");
        requestParam.setOperator_id("id");
        requestParam.setVersion("2.0");
        requestParam.setSign_type("MD5");
        requestParam.setRequest_id(UUID.randomUUID().toString());
        String currentTime = DateUtil.format(new Date(),"yyyyMMddHHmmss");
        requestParam.setRequest_time(currentTime);
    }

    /**
     * 条码支付
     */
    @RequestMapping(value = "/barcode",method = RequestMethod.GET)
    public String barcodePay(String barcode,String amount,String subject,String remark){
        log.info("barcode param, barcode={}, amount={}, subject={}, remark={}",barcode,amount,subject,remark);
        BarcodePayRequestParam barcodePayParam = new BarcodePayRequestParam();
        // 公共参数
        barcodePayParam.setCommand("open.api.barcode");
        setCommonRequestParam(barcodePayParam);
        // H5支付参数
        barcodePayParam.setLocal_order_no("order"+ RandomUtil.randomNumbers(10));
        barcodePayParam.setBarcode(barcode);
        barcodePayParam.setAmount(amount);
        barcodePayParam.setSubject(subject);
        barcodePayParam.setRemark(remark);
        barcodePayParam.setNotify_url(notify_url);
        // 生成签名
        Map<String,Object> params = JSONUtil.parseObj(barcodePayParam);
        String sign = PayUtil.MD5Sign(params,key);
        params.put("sign",sign);
        log.info("barcode pay param:{}",params);
        // 获取支付链接
        String post = HttpUtil.post(url, params);
        JSONObject result = JSONUtil.parseObj(post);
        log.info("barcode pay result:{}",result);
        return result.toString();
    }
}
