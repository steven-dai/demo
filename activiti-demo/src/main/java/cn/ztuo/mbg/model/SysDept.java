package cn.ztuo.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

/**
 * 部门表
 *
 * @author ztuo
 * @date 2022-03-25 11:18:58
 */
public class SysDept implements Serializable {
    /**
     * 记录ID
     */
    @ApiModelProperty(value = "记录ID")
    private String id;

    /**
     * 父机构ID
     */
    @ApiModelProperty(value = "父机构ID")
    private String parentId;

    /**
     * 根节点（所属公司）
     */
    @ApiModelProperty(value = "根节点（所属公司）")
    private String rootNode;

    /**
     * 机构/部门名称
     */
    @ApiModelProperty(value = "机构/部门名称")
    private String deptName;

    /**
     * 英文名
     */
    @ApiModelProperty(value = "英文名")
    private String deptNameEn;

    /**
     * 缩写
     */
    @ApiModelProperty(value = "缩写")
    private String deptNameAbbr;

    /**
     * 排序
     */
    @ApiModelProperty(value = "排序")
    private Long deptOrder;

    /**
     * 机构类别 0：公司；1：机构；2部门
     */
    @ApiModelProperty(value = "机构类别 0：公司；1：机构；2部门")
    private String orgCategory;

    /**
     * 机构层级
     */
    @ApiModelProperty(value = "机构层级")
    private String orgType;

    /**
     * 机构编码
     */
    @ApiModelProperty(value = "机构编码")
    private String orgCode;

    /**
     * 电子邮件
     */
    @ApiModelProperty(value = "电子邮件")
    private String email;

    /**
     * 联系电话
     */
    @ApiModelProperty(value = "联系电话")
    private String phone;

    /**
     * 传真
     */
    @ApiModelProperty(value = "传真")
    private String fax;

    /**
     * 地址
     */
    @ApiModelProperty(value = "地址")
    private String address;

    /**
     * 路径
     */
    @ApiModelProperty(value = "路径")
    private String path;

    /**
     * 部门类型
     */
    @ApiModelProperty(value = "部门类型")
    private String deptType;

    /**
     * 状态（1启用，0不启用）
     */
    @ApiModelProperty(value = "状态（1启用，0不启用）")
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

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getRootNode() {
        return rootNode;
    }

    public void setRootNode(String rootNode) {
        this.rootNode = rootNode;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptNameEn() {
        return deptNameEn;
    }

    public void setDeptNameEn(String deptNameEn) {
        this.deptNameEn = deptNameEn;
    }

    public String getDeptNameAbbr() {
        return deptNameAbbr;
    }

    public void setDeptNameAbbr(String deptNameAbbr) {
        this.deptNameAbbr = deptNameAbbr;
    }

    public Long getDeptOrder() {
        return deptOrder;
    }

    public void setDeptOrder(Long deptOrder) {
        this.deptOrder = deptOrder;
    }

    public String getOrgCategory() {
        return orgCategory;
    }

    public void setOrgCategory(String orgCategory) {
        this.orgCategory = orgCategory;
    }

    public String getOrgType() {
        return orgType;
    }

    public void setOrgType(String orgType) {
        this.orgType = orgType;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getDeptType() {
        return deptType;
    }

    public void setDeptType(String deptType) {
        this.deptType = deptType;
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
        sb.append(", parentId=").append(parentId);
        sb.append(", rootNode=").append(rootNode);
        sb.append(", deptName=").append(deptName);
        sb.append(", deptNameEn=").append(deptNameEn);
        sb.append(", deptNameAbbr=").append(deptNameAbbr);
        sb.append(", deptOrder=").append(deptOrder);
        sb.append(", orgCategory=").append(orgCategory);
        sb.append(", orgType=").append(orgType);
        sb.append(", orgCode=").append(orgCode);
        sb.append(", email=").append(email);
        sb.append(", phone=").append(phone);
        sb.append(", fax=").append(fax);
        sb.append(", address=").append(address);
        sb.append(", path=").append(path);
        sb.append(", deptType=").append(deptType);
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