/**
 *
 * @author ztuo
 * @date 2022-03-25 11:18:58
 */
package cn.ztuo.mbg.mapper;

import cn.ztuo.mbg.model.SysDept;
import cn.ztuo.mbg.model.SysDeptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysDeptMapper {
    /**
     * countByExample
     * 
     * @param example
     * @return long
     */
    long countByExample(SysDeptExample example);

    /**
     * deleteByExample
     * 
     * @param example
     * @return int
     */
    int deleteByExample(SysDeptExample example);

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
    int insert(SysDept record);

    /**
     * insertSelective
     * 
     * @param record
     * @return int
     */
    int insertSelective(SysDept record);

    /**
     * selectByExample
     * 
     * @param example
     * @return java.util.List<cn.ztuo.mbg.model.SysDept>
     */
    List<SysDept> selectByExample(SysDeptExample example);

    /**
     * selectByPrimaryKey
     * 
     * @param id
     * @return cn.ztuo.mbg.model.SysDept
     */
    SysDept selectByPrimaryKey(String id);

    /**
     * updateByExampleSelective
     * 
     * @param record
     * @param example
     * @return int
     */
    int updateByExampleSelective(@Param("record") SysDept record, @Param("example") SysDeptExample example);

    /**
     * updateByExample
     * 
     * @param record
     * @param example
     * @return int
     */
    int updateByExample(@Param("record") SysDept record, @Param("example") SysDeptExample example);

    /**
     * updateByPrimaryKeySelective
     * 
     * @param record
     * @return int
     */
    int updateByPrimaryKeySelective(SysDept record);

    /**
     * updateByPrimaryKey
     * 
     * @param record
     * @return int
     */
    int updateByPrimaryKey(SysDept record);
}