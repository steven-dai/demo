/**
 *
 * @author ztuo
 * @date 2022-03-25 11:20:24
 */
package cn.ztuo.mbg.mapper;

import cn.ztuo.mbg.model.SysRoleMenu;
import cn.ztuo.mbg.model.SysRoleMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRoleMenuMapper {
    /**
     * countByExample
     * 
     * @param example
     * @return long
     */
    long countByExample(SysRoleMenuExample example);

    /**
     * deleteByExample
     * 
     * @param example
     * @return int
     */
    int deleteByExample(SysRoleMenuExample example);

    /**
     * deleteByPrimaryKey
     * 
     * @param id
     * @return int
     */
    int deleteByPrimaryKey(String id);

    /**
     * insert
     * 
     * @param record
     * @return int
     */
    int insert(SysRoleMenu record);

    /**
     * insertSelective
     * 
     * @param record
     * @return int
     */
    int insertSelective(SysRoleMenu record);

    /**
     * selectByExample
     * 
     * @param example
     * @return java.util.List<cn.ztuo.mbg.model.SysRoleMenu>
     */
    List<SysRoleMenu> selectByExample(SysRoleMenuExample example);

    /**
     * selectByPrimaryKey
     * 
     * @param id
     * @return cn.ztuo.mbg.model.SysRoleMenu
     */
    SysRoleMenu selectByPrimaryKey(String id);

    /**
     * updateByExampleSelective
     * 
     * @param record
     * @param example
     * @return int
     */
    int updateByExampleSelective(@Param("record") SysRoleMenu record, @Param("example") SysRoleMenuExample example);

    /**
     * updateByExample
     * 
     * @param record
     * @param example
     * @return int
     */
    int updateByExample(@Param("record") SysRoleMenu record, @Param("example") SysRoleMenuExample example);

    /**
     * updateByPrimaryKeySelective
     * 
     * @param record
     * @return int
     */
    int updateByPrimaryKeySelective(SysRoleMenu record);

    /**
     * updateByPrimaryKey
     * 
     * @param record
     * @return int
     */
    int updateByPrimaryKey(SysRoleMenu record);
}