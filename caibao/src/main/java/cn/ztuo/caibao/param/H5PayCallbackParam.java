package cn.ztuo.caibao.param;

import lombok.Data;

/**
 * @author steven
 * @date 2022-06-11 16:17
 */
@Data
public class H5PayCallbackParam {

    private String cbOrderNo;
    private String appOrderNo;
    private String outOrderNo;
    private String orderStatus;
    private String totalAmount;
    private String receiveAmount;
    private String paymentChannel;
    private String subject;
    private String discountAmount;
    private String paymentWay;
    private String payTime;
    private String sign;

}
