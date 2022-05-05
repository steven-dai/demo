package cn.ztuo.service.impl;

import cn.ztuo.mbg.mapper.SysDeptMapper;
import cn.ztuo.mbg.mapper.SysUserDeptMapper;
import cn.ztuo.mbg.model.SysDept;
import cn.ztuo.mbg.model.SysDeptExample;
import cn.ztuo.mbg.model.SysUserDept;
import cn.ztuo.mbg.model.SysUserDeptExample;
import cn.ztuo.service.SysDeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * SysRoleSVImpl
 */
@Service
public class SysDeptServiceImpl implements SysDeptService {

    @Resource
    private SysDeptMapper sysDeptMapper;

    @Resource
    private SysUserDeptMapper sysUserDeptMapper;

    @Override
    public List<SysDept> getDeptList(String userId) {
        // 根据用户ID查询部门列表
        SysUserDeptExample sysUserDeptExample = new SysUserDeptExample();
        sysUserDeptExample.createCriteria().andUserIdEqualTo(userId);
        List<SysUserDept> sysUserDepts = sysUserDeptMapper.selectByExample(sysUserDeptExample);
        // 根据部门ID查询部门信息
        List<String> deptIds = new ArrayList<>();
        sysUserDepts.forEach(sysUserDept -> {
            deptIds.add(sysUserDept.getDeptId());
        });
        SysDeptExample sysDeptExample = new SysDeptExample();
        sysDeptExample.createCriteria().andIdIn(deptIds);
        List<SysDept> depts = sysDeptMapper.selectByExample(sysDeptExample);
        return depts;
    }

}