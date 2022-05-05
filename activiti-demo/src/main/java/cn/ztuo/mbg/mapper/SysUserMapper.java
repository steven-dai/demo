/**
 *
 * @author ztuo
 * @date 2022-03-25 11:15:01
 */
package cn.ztuo.mbg.mapper;

import cn.ztuo.mbg.model.SysUser;
import cn.ztuo.mbg.model.SysUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserMapper {
    /**
     * countByExample
     * 
     * @param example
     * @return long
     */
    long countByExample(SysUserExample example);

    /**
     * deleteByExample
     * 
     * @param example
     * @return int
     */
    int deleteByExample(SysUserExample example);

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
    int insert(SysUser record);

    /**
     * insertSelective
     * 
     * @param record
     * @return int
     */
    int insertSelective(SysUser record);

    /**
     * selectByExample
     * 
     * @param example
     * @return java.util.List<cn.ztuo.mbg.model.SysUser>
     */
    List<SysUser> selectByExample(SysUserExample example);

    /**
     * selectByPrimaryKey
     * 
     * @param id
     * @return cn.ztuo.mbg.model.SysUser
     */
    SysUser selectByPrimaryKey(String id);

    /**
     * updateByExampleSelective
     * 
     * @param record
     * @param example
     * @return int
     */
    int updateByExampleSelective(@Param("record") SysUser record, @Param("example") SysUserExample example);

    /**
     * updateByExample
     * 
     * @param record
     * @param example
     * @return int
     */
    int updateByExample(@Param("record") SysUser record, @Param("example") SysUserExample example);

    /**
     * updateByPrimaryKeySelective
     * 
     * @param record
     * @return int
     */
    int updateByPrimaryKeySelective(SysUser record);

    /**
     * updateByPrimaryKey
     * 
     * @param record
     * @return int
     */
    int updateByPrimaryKey(SysUser record);
}