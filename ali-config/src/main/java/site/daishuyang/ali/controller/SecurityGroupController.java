package site.daishuyang.ali.controller;

import cn.hutool.crypto.SecureUtil;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.aliyun.ecs20140526.Client;
import com.aliyun.ecs20140526.models.*;
import com.aliyun.teaopenapi.models.Config;
import org.springframework.web.bind.annotation.*;
import site.daishuyang.ali.bean.AliInfo;
import site.daishuyang.ali.bean.SecurityGroupInfo;
import site.daishuyang.ali.config.AliConfig;

import javax.annotation.Resource;
import java.util.List;

/**
 * 安全组配置
 *
 * @author steven
 * @date 2022-01-19 16:42
 */
@RestController
@RequestMapping("/security/group")
public class SecurityGroupController {

    @Resource
    private AliConfig aliConfig;

    @GetMapping("list")
    public JSONObject rules
            (@RequestHeader String token) throws Exception {
        AliInfo aliInfo = verifyToken(token);
        if (aliInfo == null) {
            // token失效，回到首页
            return null;
        }
        // 获取client
        Client client = createClient(aliInfo.getAccessKeyId(), aliInfo.getAccessKeySecret(), aliInfo.getEndpoint());
        // 查询所有的安全组
        DescribeSecurityGroupsRequest describeSecurityGroupsRequest = new DescribeSecurityGroupsRequest().setRegionId(aliInfo.getRegionId());
        // 复制代码运行请自行打印 API 的返回值
        DescribeSecurityGroupsResponseBody responseBody = client.describeSecurityGroups(describeSecurityGroupsRequest).getBody();
        if (responseBody != null) {
            List<DescribeSecurityGroupsResponseBody.DescribeSecurityGroupsResponseBodySecurityGroupsSecurityGroup> group
                    = responseBody.getSecurityGroups().getSecurityGroup();
            JSONObject json = new JSONObject();
            json.putOnce("data", group);
            return json;
        }
        return null;
    }

    @GetMapping("one")
    public JSONObject ruleInfo(@RequestHeader String token, String securityGroupId) throws Exception {
        AliInfo aliInfo = verifyToken(token);
        if (aliInfo == null) {
            // token失效，回到首页
            return null;
        }
        // 获取client
        Client client = createClient(aliInfo.getAccessKeyId(), aliInfo.getAccessKeySecret(), aliInfo.getEndpoint());
        // 查询某个安全组配置规则
        DescribeSecurityGroupAttributeRequest describeSecurityGroupAttributeRequest = new DescribeSecurityGroupAttributeRequest().setSecurityGroupId(securityGroupId).setRegionId(aliInfo.getRegionId());
        // 复制代码运行请自行打印 API 的返回值
        DescribeSecurityGroupAttributeResponseBody responseBody = client.describeSecurityGroupAttribute(describeSecurityGroupAttributeRequest).getBody();
        if (responseBody != null) {
            List<DescribeSecurityGroupAttributeResponseBody.DescribeSecurityGroupAttributeResponseBodyPermissionsPermission> permission
                    = responseBody.getPermissions().getPermission();
            JSONObject json = new JSONObject();
            json.putOnce("data", permission);
            return json;
        }
        return null;
    }


    @PostMapping("")
    public JSONObject addRule(@RequestHeader String token, @RequestBody SecurityGroupInfo securityGroupInfo) throws Exception {
        AliInfo aliInfo = verifyToken(token);
        if (aliInfo == null) {
            // token失效，回到首页
            return null;
        }
        // 获取client
        Client client = createClient(aliInfo.getAccessKeyId(), aliInfo.getAccessKeySecret(), aliInfo.getEndpoint());
        AuthorizeSecurityGroupRequest authorizeSecurityGroupRequest = new AuthorizeSecurityGroupRequest()
                .setRegionId(aliInfo.getRegionId())
                .setSecurityGroupId(securityGroupInfo.getSecurityGroupId())
                .setSourceCidrIp(securityGroupInfo.getSourceCidrIp())
                .setIpProtocol("all")
                .setPortRange("-1/-1")
                .setClientToken(token)
                .setDescription("API临时增加");
        // 复制代码运行请自行打印 API 的返回值
        AuthorizeSecurityGroupResponse response = client.authorizeSecurityGroup(authorizeSecurityGroupRequest);
        return JSONUtil.parseObj(response.getBody());
    }

    @DeleteMapping("")
    public JSONObject deleteRule(@RequestHeader String token, @RequestBody SecurityGroupInfo securityGroupInfo) throws Exception {
        AliInfo aliInfo = verifyToken(token);
        if (aliInfo == null) {
            // token失效，回到首页
            return null;
        }
        // 获取client
        Client client = createClient(aliInfo.getAccessKeyId(), aliInfo.getAccessKeySecret(), aliInfo.getEndpoint());
        RevokeSecurityGroupRequest revokeSecurityGroupRequest = new RevokeSecurityGroupRequest()
                .setRegionId(aliInfo.getRegionId())
                .setSecurityGroupId(securityGroupInfo.getSecurityGroupId())
                .setSourceCidrIp(securityGroupInfo.getSourceCidrIp())
                .setIpProtocol("all")
                .setPortRange("-1/-1")
                .setClientToken(token)
                .setDescription("API临时增加");
        // 复制代码运行请自行打印 API 的返回值
        RevokeSecurityGroupResponse response = client.revokeSecurityGroup(revokeSecurityGroupRequest);
        return JSONUtil.parseObj(response.getBody());
    }


    /**
     * 验证token
     *
     * @param token
     * @return site.daishuyang.ali.bean.AliInfo
     * @author steven
     * @date 2022/1/19 19:31
     */
    public AliInfo verifyToken(String token) {
        // token解密
        String tokenStr = SecureUtil.des(AliConfig.DES_KEY.getBytes()).decryptStr(token);
        if (tokenStr != null) {
            String[] split = tokenStr.split(":");
            // 验证是否过期1分钟
            long times = Long.valueOf(split[1]);
            long diff = (System.currentTimeMillis() - times)/1000;
            if (diff < 60) {
                Integer aliId = Integer.valueOf(split[0]);
                // 根据ID获取配置信息
                return aliConfig.getAliInfos().stream().filter(aliInfo -> aliId.equals(aliInfo.getId())).findFirst().get();
            }
        }
        return null;
    }

    /**
     * 根据登录账号初始化client
     *
     * @param accessKeyId
     * @param accessKeySecret
     * @return Client
     * @throws Exception
     */
    public Client createClient(String accessKeyId, String accessKeySecret, String endpoint) throws Exception {
        Config config = new Config();
        // 您的AccessKey ID
        config.setAccessKeyId(accessKeyId);
        // 您的AccessKey Secret
        config.setAccessKeySecret(accessKeySecret);
        // 访问的域名
        config.setEndpoint(endpoint);
        // 创建对象
        return new Client(config);
    }

}
