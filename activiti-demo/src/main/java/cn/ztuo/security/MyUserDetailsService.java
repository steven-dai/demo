package cn.ztuo.security;

import cn.ztuo.service.SysUserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import javax.annotation.Resource;

/**
 * @author steven
 * @date 2022-03-26 16:06
 */
public class MyUserDetailsService implements UserDetailsService {

    @Resource
    SysUserService sysUserService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return new LoginUserDetails(sysUserService.loadByUsername(username));
    }
}
