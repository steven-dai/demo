package site.daishuyang.ali.bean;

import lombok.Data;

/**
 * @author steven
 * @date 2022-01-19 18:05
 */
@Data
public class AliInfo {
    private Integer id;
    private String desc;
    private String accessKeyId;
    private String accessKeySecret;
    private String endpoint;
    private String regionId;
    private String account;
}
