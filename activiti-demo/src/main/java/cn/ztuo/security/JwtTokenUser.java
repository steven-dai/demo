package cn.ztuo.security;

import cn.ztuo.mbg.model.SysDept;
import cn.ztuo.mbg.model.SysMenu;
import cn.ztuo.mbg.model.SysRole;
import lombok.Data;
import java.util.List;

/**
 * JwtToken用户
 * 
 * @author ztuo
 */
@Data
public class JwtTokenUser {

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 登录用户名
     */
    private String username;

    /**
     * 登录密码
     */
    private String password;

    /**
     * 用户是否有效
     */
    private boolean validStatus;

    /**
     * 用户部门信息
     */
    private List<SysDept> depts;

    /**
     * 用户角色信息
     */
    private List<SysRole> roles;

    /**
     * 用户权限信息
     */
    private List<SysMenu> permissions;
}