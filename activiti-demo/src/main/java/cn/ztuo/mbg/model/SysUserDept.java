package cn.ztuo.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * 用户部门关联表
 *
 * @author ztuo
 * @date 2022-03-25 11:19:51
 */
public class SysUserDept implements Serializable {
    /**
     * 记录ID
     */
    @ApiModelProperty(value = "记录ID")
    private String id;

    /**
     * 用户ID
     */
    @ApiModelProperty(value = "用户ID")
    private String userId;

    /**
     * 部门ID
     */
    @ApiModelProperty(value = "部门ID")
    private String deptId;

    /**
     * 默认部门
     */
    @ApiModelProperty(value = "默认部门")
    private String defaultDept;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDefaultDept() {
        return defaultDept;
    }

    public void setDefaultDept(String defaultDept) {
        this.defaultDept = defaultDept;
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
        sb.append(", userId=").append(userId);
        sb.append(", deptId=").append(deptId);
        sb.append(", defaultDept=").append(defaultDept);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}