/**
 *
 * @author ztuo
 * @date 2022-03-25 11:19:25
 */
package cn.ztuo.mbg.mapper;

import cn.ztuo.mbg.model.SysUserRole;
import cn.ztuo.mbg.model.SysUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserRoleMapper {
    /**
     * countByExample
     * 
     * @param example
     * @return long
     */
    long countByExample(SysUserRoleExample example);

    /**
     * deleteByExample
     * 
     * @param example
     * @return int
     */
    int deleteByExample(SysUserRoleExample example);

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
    int insert(SysUserRole record);

    /**
     * insertSelective
     * 
     * @param record
     * @return int
     */
    int insertSelective(SysUserRole record);

    /**
     * selectByExample
     * 
     * @param example
     * @return java.util.List<cn.ztuo.mbg.model.SysUserRole>
     */
    List<SysUserRole> selectByExample(SysUserRoleExample example);

    /**
     * selectByPrimaryKey
     * 
     * @param id
     * @return cn.ztuo.mbg.model.SysUserRole
     */
    SysUserRole selectByPrimaryKey(String id);

    /**
     * updateByExampleSelective
     * 
     * @param record
     * @param example
     * @return int
     */
    int updateByExampleSelective(@Param("record") SysUserRole record, @Param("example") SysUserRoleExample example);

    /**
     * updateByExample
     * 
     * @param record
     * @param example
     * @return int
     */
    int updateByExample(@Param("record") SysUserRole record, @Param("example") SysUserRoleExample example);

    /**
     * updateByPrimaryKeySelective
     * 
     * @param record
     * @return int
     */
    int updateByPrimaryKeySelective(SysUserRole record);

    /**
     * updateByPrimaryKey
     * 
     * @param record
     * @return int
     */
    int updateByPrimaryKey(SysUserRole record);
}