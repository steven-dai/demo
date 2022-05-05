package cn.ztuo.security;

import cn.hutool.json.JSONObject;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 当未登录或者token失效访问接口时，自定义的返回结果
 *
 * @author ztuo
 * @since 2019/11/19.
 */
public class RestAuthenticationEntryPoint implements AuthenticationEntryPoint {

    private static final JSONObject RESULT_401;

    static {
        RESULT_401 = new JSONObject();
        RESULT_401.append("code",401)
                .append("message","暂未登录或token已经过期");
    }

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response,
            AuthenticationException authException) throws IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        response.getWriter().println(RESULT_401.toJSONString(1));
        response.getWriter().flush();
    }
}
