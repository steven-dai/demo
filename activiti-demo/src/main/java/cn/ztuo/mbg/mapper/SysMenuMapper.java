/**
 *
 * @author ztuo
 * @date 2022-03-25 11:18:38
 */
package cn.ztuo.mbg.mapper;

import cn.ztuo.mbg.model.SysMenu;
import cn.ztuo.mbg.model.SysMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysMenuMapper {
    /**
     * countByExample
     * 
     * @param example
     * @return long
     */
    long countByExample(SysMenuExample example);

    /**
     * deleteByExample
     * 
     * @param example
     * @return int
     */
    int deleteByExample(SysMenuExample example);

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
    int insert(SysMenu record);

    /**
     * insertSelective
     * 
     * @param record
     * @return int
     */
    int insertSelective(SysMenu record);

    /**
     * selectByExample
     * 
     * @param example
     * @return java.util.List<cn.ztuo.mbg.model.SysMenu>
     */
    List<SysMenu> selectByExample(SysMenuExample example);

    /**
     * selectByPrimaryKey
     * 
     * @param id
     * @return cn.ztuo.mbg.model.SysMenu
     */
    SysMenu selectByPrimaryKey(String id);

    /**
     * updateByExampleSelective
     * 
     * @param record
     * @param example
     * @return int
     */
    int updateByExampleSelective(@Param("record") SysMenu record, @Param("example") SysMenuExample example);

    /**
     * updateByExample
     * 
     * @param record
     * @param example
     * @return int
     */
    int updateByExample(@Param("record") SysMenu record, @Param("example") SysMenuExample example);

    /**
     * updateByPrimaryKeySelective
     * 
     * @param record
     * @return int
     */
    int updateByPrimaryKeySelective(SysMenu record);

    /**
     * updateByPrimaryKey
     * 
     * @param record
     * @return int
     */
    int updateByPrimaryKey(SysMenu record);
}