package cn.ztuo.security;

import cn.hutool.json.JSONObject;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 当访问接口没有权限时，自定义的返回结果
 *
 * @author ztuo
 * @since 2019/11/19.
 */
public class RestAccessDeniedHandler implements AccessDeniedHandler {

    private static final JSONObject RESULT_403;

    static {
        RESULT_403 = new JSONObject();
        RESULT_403.append("code",403)
                .append("message","没有相关权限");
    }

    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException e)
            throws IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        response.getWriter().println(RESULT_403.toJSONString(1));
        response.getWriter().flush();
    }
}
