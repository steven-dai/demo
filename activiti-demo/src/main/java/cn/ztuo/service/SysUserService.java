package cn.ztuo.service;

import cn.ztuo.mbg.model.SysUser;
import cn.ztuo.security.JwtTokenUser;

import java.util.List;

/**
 * SysUserService
 * 
 * @author ztuo
 */
public interface SysUserService {

    /**
     * 根据登录名查询用户token
     * @author steven
     * @date 2022/3/25 13:38
     * @param username
     * @return cn.ztuo.security.JwtTokenUser
     */
    JwtTokenUser loadByUsername(String username);

    /**
     * 根据登录名查询用户
     * @author steven
     * @date 2022/3/25 13:38
     * @param username
     * @return cn.ztuo.mbg.model.SysUser
     */
    SysUser getByUsername(String username);

    /**
     * 根据部门ID获取用户ID
     * @author steven
     * @date 2022/3/25 13:38
     * @param deptIds
     * @return java.util.List<cn.ztuo.mbg.model.SysUser>
     */
    List<String> getUserIdsByDeptIds(List<String> deptIds);

    /**
     * 根据部门ID获取用户登录账号信息
     * @author steven
     * @date 2022/3/25 13:38
     * @param deptIds
     * @return java.util.List<cn.ztuo.mbg.model.SysUser>
     */
    List<String> getUsernamesByDeptIds(List<String> deptIds);

}