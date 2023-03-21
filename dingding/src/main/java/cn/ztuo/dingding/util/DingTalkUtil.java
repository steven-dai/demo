package cn.ztuo.dingding.util;

import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.DingTalkClient;
import com.dingtalk.api.request.OapiGettokenRequest;
import com.dingtalk.api.request.OapiReportListRequest;
import com.dingtalk.api.response.OapiGettokenResponse;
import com.dingtalk.api.response.OapiReportListResponse;
import com.taobao.api.ApiException;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

/**
 * @author steven
 * @date 2023-01-29 09:28
 */
@Slf4j
public class DingTalkUtil {
    
    private static final String APP_KEY = "123456";
    
    private static final String APP_SECRET = "qwertyuiop";
    
    private static final String TEMPLAT_NAME = "工作日志";
    
    /**
     * 获取access_token
     * @return
     * @throws Exception
     */
    public static String getAccessToken() throws ApiException {
        DingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/gettoken");
        OapiGettokenRequest req = new OapiGettokenRequest();
        req.setAppkey(APP_KEY);
        req.setAppsecret(APP_SECRET);
        req.setHttpMethod("GET");
        OapiGettokenResponse rsp = client.execute(req);
        return rsp.getAccessToken();
    }
    
    /**
     * 条件查询员工提交的日志
     */
    public OapiReportListResponse.PageVo getReportList(String accessToken, Date startTime, Date endTime, Long cursor) throws ApiException {
        DingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/topapi/report/list");
        OapiReportListRequest req = new OapiReportListRequest();
        req.setStartTime(startTime.getTime());
        req.setEndTime(endTime.getTime());
        req.setTemplateName(TEMPLAT_NAME);
        req.setCursor(cursor);
        req.setSize(20L);
        OapiReportListResponse rsp = client.execute(req, accessToken);
        return rsp.getResult();
    }
    
}
