package cn.ztuo.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

/**
 * 角色表
 *
 * @author ztuo
 * @date 2022-03-25 11:17:28
 */
public class SysRole implements Serializable {
    /**
     * 记录ID
     */
    @ApiModelProperty(value = "记录ID")
    private String id;

    /**
     * 角色名称
     */
    @ApiModelProperty(value = "角色名称")
    private String roleName;

    /**
     * 角色编码
     */
    @ApiModelProperty(value = "角色编码")
    private String roleCode;

    /**
     * 显示顺序
     */
    @ApiModelProperty(value = "显示顺序")
    private Long roleSort;

    /**
     * 数据范围（1：全部数据权限 2：自定数据权限 3：本部门及以下数据权限 4:本部门数据权限 5:个人数据权限）默认：5
     */
    @ApiModelProperty(value = "数据范围（1：全部数据权限 2：自定数据权限 3：本部门及以下数据权限 4:本部门数据权限 5:个人数据权限）默认：5")
    private String dataScope;

    /**
     * 角色状态（0正常 1停用）
     */
    @ApiModelProperty(value = "角色状态（0正常 1停用）")
    private String status;

    /**
     * 有效标志
     */
    @ApiModelProperty(value = "有效标志")
    private String sysFlag;

    /**
     * 部门
     */
    @ApiModelProperty(value = "部门")
    private String sysDept;

    /**
     * 新增用户
     */
    @ApiModelProperty(value = "新增用户")
    private String sysCreateUser;

    /**
     * 更新用户
     */
    @ApiModelProperty(value = "更新用户")
    private String sysUpdateUser;

    /**
     * 新增时间
     */
    @ApiModelProperty(value = "新增时间")
    private Date sysCreateTime;

    /**
     * 更新时间
     */
    @ApiModelProperty(value = "更新时间")
    private Date sysUpdateTime;

    /**
     * 备注/描述信息
     */
    @ApiModelProperty(value = "备注/描述信息")
    private String sysRemark;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public Long getRoleSort() {
        return roleSort;
    }

    public void setRoleSort(Long roleSort) {
        this.roleSort = roleSort;
    }

    public String getDataScope() {
        return dataScope;
    }

    public void setDataScope(String dataScope) {
        this.dataScope = dataScope;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSysFlag() {
        return sysFlag;
    }

    public void setSysFlag(String sysFlag) {
        this.sysFlag = sysFlag;
    }

    public String getSysDept() {
        return sysDept;
    }

    public void setSysDept(String sysDept) {
        this.sysDept = sysDept;
    }

    public String getSysCreateUser() {
        return sysCreateUser;
    }

    public void setSysCreateUser(String sysCreateUser) {
        this.sysCreateUser = sysCreateUser;
    }

    public String getSysUpdateUser() {
        return sysUpdateUser;
    }

    public void setSysUpdateUser(String sysUpdateUser) {
        this.sysUpdateUser = sysUpdateUser;
    }

    public Date getSysCreateTime() {
        return sysCreateTime;
    }

    public void setSysCreateTime(Date sysCreateTime) {
        this.sysCreateTime = sysCreateTime;
    }

    public Date getSysUpdateTime() {
        return sysUpdateTime;
    }

    public void setSysUpdateTime(Date sysUpdateTime) {
        this.sysUpdateTime = sysUpdateTime;
    }

    public String getSysRemark() {
        return sysRemark;
    }

    public void setSysRemark(String sysRemark) {
        this.sysRemark = sysRemark;
    }

    /**
     * toString
     * 
     * @return java.lang.String
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", roleName=").append(roleName);
        sb.append(", roleCode=").append(roleCode);
        sb.append(", roleSort=").append(roleSort);
        sb.append(", dataScope=").append(dataScope);
        sb.append(", status=").append(status);
        sb.append(", sysFlag=").append(sysFlag);
        sb.append(", sysDept=").append(sysDept);
        sb.append(", sysCreateUser=").append(sysCreateUser);
        sb.append(", sysUpdateUser=").append(sysUpdateUser);
        sb.append(", sysCreateTime=").append(sysCreateTime);
        sb.append(", sysUpdateTime=").append(sysUpdateTime);
        sb.append(", sysRemark=").append(sysRemark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}