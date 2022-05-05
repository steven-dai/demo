package cn.ztuo.service;

import cn.ztuo.mbg.model.SysMenu;

import java.util.List;

/**
 * SysMenuSV
 */
public interface SysMenuService {

    /**
     * 根据用户ID加载用户权限
     * @param userId
     * @return
     */
    List<SysMenu> getByUserId(Long userId);

    /**
     * 根据角色ID加载用户权限
     * @param roleId
     * @return
     */
    List<SysMenu> getByRoleId(Long roleId);

}