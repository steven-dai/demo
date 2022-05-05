package cn.ztuo.service.impl;

import cn.ztuo.mbg.mapper.SysUserDeptMapper;
import cn.ztuo.mbg.mapper.SysUserMapper;
import cn.ztuo.mbg.model.*;
import cn.ztuo.security.JwtTokenUser;
import cn.ztuo.service.SysRoleService;
import cn.ztuo.service.SysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * SysUserSVImpl
 *
 * @author ztuo
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    @Resource
    private SysUserMapper sysUserMapper;

    @Resource
    private SysUserDeptMapper sysUserDeptMapper;

    @Resource
    private SysRoleService sysRoleService;

    @Override
    public JwtTokenUser loadByUsername(String username) {
        SysUser sysUser = getByUsername(username);
        if (sysUser != null) {
            JwtTokenUser jwtTokenUser = new JwtTokenUser();
            jwtTokenUser.setPassword(sysUser.getPassword());
            jwtTokenUser.setUserId(sysUser.getId());
            jwtTokenUser.setUsername(sysUser.getLoginName());
            jwtTokenUser.setValidStatus(true);
            List<SysRole> roles = sysRoleService.getRoleList(sysUser.getId());
            jwtTokenUser.setRoles(roles);
            return jwtTokenUser;
        }
        return null;
    }

    @Override
    public SysUser getByUsername(String username) {
        SysUserExample example = new SysUserExample();
        SysUserExample.Criteria criteria = example.createCriteria();
        criteria.andLoginNameEqualTo(username);
        List<SysUser> sysUserList = sysUserMapper.selectByExample(example);
        if (!sysUserList.isEmpty()) {
            return sysUserList.get(0);
        }
        return null;
    }

    @Override
    public List<String> getUserIdsByDeptIds(List<String> deptIds) {
        SysUserDeptExample userDeptExample  = new SysUserDeptExample();
        userDeptExample.createCriteria().andDeptIdIn(deptIds);
        List<SysUserDept> sysUserDepts = sysUserDeptMapper.selectByExample(userDeptExample);
        List<String> userIds = new ArrayList<>();
        sysUserDepts.forEach(sysUserDept -> {
            userIds.add(sysUserDept.getUserId());
        });
        return userIds;
    }

    @Override
    public List<String> getUsernamesByDeptIds(List<String> deptIds) {
        SysUserDeptExample userDeptExample  = new SysUserDeptExample();
        userDeptExample.createCriteria().andDeptIdIn(deptIds);
        List<SysUserDept> sysUserDepts = sysUserDeptMapper.selectByExample(userDeptExample);
        List<String> userIds = new ArrayList<>();
        sysUserDepts.forEach(sysUserDept -> {
            userIds.add(sysUserDept.getUserId());
        });
        SysUserExample sysUserExample = new SysUserExample();
        sysUserExample.createCriteria().andIdIn(userIds);
        List<SysUser> sysUsers = sysUserMapper.selectByExample(sysUserExample);
        List<String> usernames = new ArrayList<>();
        sysUsers.forEach(sysUser -> {
            usernames.add(sysUser.getLoginName());
        });
        return usernames;
    }

}