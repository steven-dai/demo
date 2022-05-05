package cn.ztuo.service.impl;

import cn.ztuo.mbg.mapper.SysMenuMapper;
import cn.ztuo.mbg.model.SysMenu;
import cn.ztuo.service.SysMenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * SysMenuSVImpl
 */
@Service
public class SysMenuServiceImpl implements SysMenuService {

    @Resource
    private SysMenuMapper sysMenuMapper;

    @Override
    public List<SysMenu> getByUserId(Long userId) {
        List<SysMenu> permission = new ArrayList<>();
        return permission;
    }

    @Override
    public List<SysMenu> getByRoleId(Long roleId) {
        List<SysMenu> permission = new ArrayList<>();
        return permission;
    }
}