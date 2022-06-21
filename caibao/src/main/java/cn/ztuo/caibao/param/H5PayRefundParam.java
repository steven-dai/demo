package cn.ztuo.caibao.param;

import lombok.Data;

/**
 * @author steven
 * @date 2022-06-11 15:02
 */
@Data
public class H5PayRefundParam extends CommonRequestParam{

    private String  local_order_no;
    private String  cb_order_no;
    private String  local_refund_no;
    private String  refund_amount;
    private String  reason;
}
