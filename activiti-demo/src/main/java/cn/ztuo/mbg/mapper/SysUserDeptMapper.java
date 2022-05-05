/**
 *
 * @author ztuo
 * @date 2022-03-25 11:19:51
 */
package cn.ztuo.mbg.mapper;

import cn.ztuo.mbg.model.SysUserDept;
import cn.ztuo.mbg.model.SysUserDeptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserDeptMapper {
    /**
     * countByExample
     * 
     * @param example
     * @return long
     */
    long countByExample(SysUserDeptExample example);

    /**
     * deleteByExample
     * 
     * @param example
     * @return int
     */
    int deleteByExample(SysUserDeptExample example);

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
    int insert(SysUserDept record);

    /**
     * insertSelective
     * 
     * @param record
     * @return int
     */
    int insertSelective(SysUserDept record);

    /**
     * selectByExample
     * 
     * @param example
     * @return java.util.List<cn.ztuo.mbg.model.SysUserDept>
     */
    List<SysUserDept> selectByExample(SysUserDeptExample example);

    /**
     * selectByPrimaryKey
     * 
     * @param id
     * @return cn.ztuo.mbg.model.SysUserDept
     */
    SysUserDept selectByPrimaryKey(String id);

    /**
     * updateByExampleSelective
     * 
     * @param record
     * @param example
     * @return int
     */
    int updateByExampleSelective(@Param("record") SysUserDept record, @Param("example") SysUserDeptExample example);

    /**
     * updateByExample
     * 
     * @param record
     * @param example
     * @return int
     */
    int updateByExample(@Param("record") SysUserDept record, @Param("example") SysUserDeptExample example);

    /**
     * updateByPrimaryKeySelective
     * 
     * @param record
     * @return int
     */
    int updateByPrimaryKeySelective(SysUserDept record);

    /**
     * updateByPrimaryKey
     * 
     * @param record
     * @return int
     */
    int updateByPrimaryKey(SysUserDept record);
}