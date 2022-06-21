package cn.ztuo.caibao.param;

import lombok.Data;

/**
 * @author steven
 * @date 2022-06-11 15:02
 */
@Data
public class H5PayRequestParam extends CommonRequestParam{

    private String local_order_no;
    private String  amount;
    private String  un_discount_amount;
    private String  subject;
    private String remark;
    private String  confirm_way;
    private String  goods_list;
    private String  notify_url;
    private String  redirect_url;
    private String device_create_ip;
    private String expire_in;
}
