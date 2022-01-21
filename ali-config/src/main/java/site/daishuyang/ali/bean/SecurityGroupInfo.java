package site.daishuyang.ali.bean;

import lombok.Data;

/**
 * 安全组信息
 * @author steven
 * @date 2022-01-19 19:36
 */
@Data
public class SecurityGroupInfo {
    private String securityGroupId;
    private String sourceCidrIp;
}
