package cn.ztuo.caibao.param;

import lombok.Data;

/**
 * @author steven
 * @date 2022-06-11 15:00
 */
@Data
public class CommonRequestParam {

    String command;
    String app;
    String operator_id;
    String version;
    String sign_type;
    String request_id;
    String request_time;
    String sign;

}
