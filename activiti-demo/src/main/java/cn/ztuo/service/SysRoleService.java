package cn.ztuo.service;

import cn.ztuo.mbg.model.SysRole;

import java.util.List;

/**
 * SysRoleSV
 */
public interface SysRoleService {

    /**
     * 查询用户角色信息
     * 
     * @param userId
     * @return
     */
    List<SysRole> getRoleList(String userId);

}