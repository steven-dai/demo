package cn.ztuo.security;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author steven
 * @date 2022-03-22 22:39
 */
@Slf4j
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Resource
    IgnoreUrlsConfig ignoreUrlsConfig;

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        // 配置身份验证管理器
        auth.userDetailsService(myUserDetailsService());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // 允许的URL
        List<String> urlList = ignoreUrlsConfig.getUrls();
        String[] urls = urlList.toArray(new String[urlList.size()]);
        http
            // 支持跨域
            .cors().and()
            // 关闭跨站请求防护
            .csrf().disable()
            // 会话管理设置为无状态
            .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
            // 请求认证
            .authorizeRequests()
            // 允许跨域请求的OPTIONS请求
            .antMatchers(HttpMethod.OPTIONS).permitAll()
            // 允许白名单API请求
            .antMatchers(urls).permitAll()
            // 其他没有匹配的请求都认证
            .anyRequest().authenticated().and()
            // 自定义登录失效处理类
            .exceptionHandling().authenticationEntryPoint(restAuthenticationEntryPoint()).and()
            // 自定义权限拒绝处理类
            .exceptionHandling().accessDeniedHandler(restAccessDeniedHandler()).and()
            // 自定义认证拦截器JWT过滤器
            .addFilterBefore(jwtTokenFilter(), UsernamePasswordAuthenticationFilter.class);
    }

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);
        config.addAllowedOrigin("*");
        config.addAllowedHeader("*");
        config.addAllowedMethod("*");
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }

    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Bean
    public UserDetailsService myUserDetailsService() {
        return new MyUserDetailsService();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public JwtTokenFilter jwtTokenFilter() {
        return new JwtTokenFilter();
    }

    @Bean
    public RestAccessDeniedHandler restAccessDeniedHandler() {
        return new RestAccessDeniedHandler();
    }

    @Bean
    public RestAuthenticationEntryPoint restAuthenticationEntryPoint() {
        return new RestAuthenticationEntryPoint();
    }

}