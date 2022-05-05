package cn.ztuo.activiti.controller;

import cn.ztuo.mbg.model.SysRole;
import cn.ztuo.mbg.model.SysUser;
import cn.ztuo.security.*;
import cn.ztuo.security.JwtTokenUtil;
import cn.ztuo.service.SysRoleService;
import cn.ztuo.service.SysUserService;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author steven
 * @date 2022-03-25 14:29
 */
@RestController
@RequestMapping("/login")
public class LoginController {

    @Resource
    SysUserService sysUserService;

    @Resource
    JwtTokenUtil jwtTokenUtil;

    @Resource
    private SysRoleService sysRoleService;

    /**
     * 根据用户名登录
     * @param username
     * @param password
     * @return
     */
    @RequestMapping(value = "", method = RequestMethod.POST)
    public String loginByUsername(
            @RequestParam(value = "username", required = false) String username,
            @RequestParam(value = "password", required = false) String password) {
        SysUser sysUser = sysUserService.getByUsername(username);
        if (sysUser == null) {
            return "账号不存在";
        }
        JwtTokenUser jwtTokenUser = new JwtTokenUser();
        jwtTokenUser.setPassword(sysUser.getPassword());
        jwtTokenUser.setUserId(sysUser.getId());
        jwtTokenUser.setUsername(username);
        jwtTokenUser.setValidStatus(true);
        List<SysRole> roles = sysRoleService.getRoleList(sysUser.getId());
        jwtTokenUser.setRoles(roles);
        UserDetails userDetails = new LoginUserDetails(jwtTokenUser);
        UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String token = JwtTokenUtil.TOKEN_HEAD + jwtTokenUtil.generateToken(userDetails);
        return token;
    }
}
