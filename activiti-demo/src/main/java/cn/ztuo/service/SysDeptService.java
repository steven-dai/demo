package cn.ztuo.service;

import cn.ztuo.mbg.model.SysDept;

import java.util.List;

/**
 * SysDeptService
 */
public interface SysDeptService {

    /**
     * 查询用户部门信息
     * 
     * @param userId
     * @return
     */
    List<SysDept> getDeptList(String userId);

}