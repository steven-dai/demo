package cn.ztuo.service.impl;

import cn.ztuo.mbg.mapper.SysRoleMapper;
import cn.ztuo.mbg.mapper.SysUserMapper;
import cn.ztuo.mbg.mapper.SysUserRoleMapper;
import cn.ztuo.mbg.model.SysRole;
import cn.ztuo.mbg.model.SysRoleExample;
import cn.ztuo.mbg.model.SysUserRole;
import cn.ztuo.mbg.model.SysUserRoleExample;
import cn.ztuo.service.SysRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * SysRoleSVImpl
 */
@Service
public class SysRoleServiceImpl implements SysRoleService {

    @Resource
    private SysRoleMapper sysRoleMapper;

    @Resource
    private SysUserRoleMapper sysUserRoleMapper;

    @Override
    public List<SysRole> getRoleList(String userId) {
        // 根据用户ID查询角色列表
        SysUserRoleExample sysUserRoleExample = new SysUserRoleExample();
        sysUserRoleExample.createCriteria().andUserIdEqualTo(userId);
        List<SysUserRole> sysUserRoles = sysUserRoleMapper.selectByExample(sysUserRoleExample);
        // 根据角色ID查询角色信息
        List<String> roleIds = new ArrayList<>();
        sysUserRoles.forEach(sysUserRole -> {
            roleIds.add(sysUserRole.getRoleId());
        });
        SysRoleExample roleExample = new SysRoleExample();
        roleExample.createCriteria().andIdIn(roleIds);
        List<SysRole> roles = sysRoleMapper.selectByExample(roleExample);
        return roles;
    }

}