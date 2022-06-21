package cn.ztuo.caibao.param;

import lombok.Data;

/**
 * @author steven
 * @date 2022-06-11 15:02
 */
@Data
public class BarcodePayRequestParam extends CommonRequestParam{

    private String  local_order_no;
    private String  barcode;
    private String  amount;
    private String  subject;
    private String  remark;
    private String  goods_list;
    private String  notify_url;
}
