package cn.ztuo.security;

import cn.ztuo.service.SysUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.annotation.Resource;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * JWT登录授权过滤器
 * @author ztuo
 */
@Slf4j
public class JwtTokenFilter extends OncePerRequestFilter {

    private AntPathMatcher antPathMatcher = new AntPathMatcher();

    @Resource
    IgnoreUrlsConfig ignoreUrlsConfig;

    @Resource
    JwtTokenUtil jwtTokenUtil;

    @Resource
    SysUserService sysUserService;

    //@Override
    //protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
    //        throws ServletException, IOException {
    //    String uri = request.getRequestURI();
    //    boolean continueFlag = true;
    //    // 白名单地址直接过
    //    List<String> urls = ignoreUrlsConfig.getUrls();
    //    for (String url : urls) {
    //        if (antPathMatcher.match(url, uri)) {
    //            continueFlag = false;
    //            break;
    //        }
    //    }
    //    if (continueFlag) {
    //        // 非白名单处理token
    //        String authorization = request.getHeader(JwtTokenUtil.TOKEN_HEADER);
    //        if (authorization != null && authorization.startsWith(JwtTokenUtil.TOKEN_HEAD)) {
    //            String authToken = authorization.substring(JwtTokenUtil.TOKEN_HEAD.length());
    //            if (jwtTokenUtil.validateToken(authToken)) {
    //                // TODO 根据登录账号查询登录用户信息
    //                String username = jwtTokenUtil.getUserNameFromToken(authToken);
    //                JwtTokenUser tokenUser = sysUserService.loadByUsername(username);
    //                UserDetails userDetails = new LoginUserDetails(tokenUser);
    //                UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(
    //                        userDetails, null, userDetails.getAuthorities());
    //                authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
    //                SecurityContextHolder.getContext().setAuthentication(authentication);
    //                log.info("jwt authenticated success! {}", username);
    //            }
    //        }
    //    }
    //    chain.doFilter(request, response);
    //}

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
            throws ServletException, IOException {
        String authorization = request.getHeader(JwtTokenUtil.TOKEN_HEADER);
        if (authorization != null && authorization.startsWith(JwtTokenUtil.TOKEN_HEAD)) {
            String authToken = authorization.substring(JwtTokenUtil.TOKEN_HEAD.length());
            if (jwtTokenUtil.validateToken(authToken)) {
                // TODO 根据登录账号查询登录用户信息
                String username = jwtTokenUtil.getUserNameFromToken(authToken);
                JwtTokenUser tokenUser = sysUserService.loadByUsername(username);
                UserDetails userDetails = new LoginUserDetails(tokenUser);
                UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(
                        userDetails, null, userDetails.getAuthorities());
                authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                SecurityContextHolder.getContext().setAuthentication(authentication);
                log.info("jwt authenticated success! {}", username);
            }
        }
        chain.doFilter(request, response);
    }
}
