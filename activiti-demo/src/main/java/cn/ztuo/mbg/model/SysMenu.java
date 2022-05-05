package cn.ztuo.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

/**
 * 菜单表
 *
 * @author ztuo
 * @date 2022-03-25 11:18:38
 */
public class SysMenu implements Serializable {
    /**
     * 记录ID
     */
    @ApiModelProperty(value = "记录ID")
    private String id;

    /**
     * 项目ID
     */
    @ApiModelProperty(value = "项目ID")
    private String projectId;

    /**
     * 父节点ID
     */
    @ApiModelProperty(value = "父节点ID")
    private String parentId;

    /**
     * 菜单状态（0显示 1隐藏）
     */
    @ApiModelProperty(value = "菜单状态（0显示 1隐藏）")
    private String menuStatus;

    /**
     * 菜单类型(0:一级菜单; 1:子菜单:2:按钮权限)
     */
    @ApiModelProperty(value = "菜单类型(0:一级菜单; 1:子菜单:2:按钮权限)")
    private String menuType;

    /**
     * 菜单排序
     */
    @ApiModelProperty(value = "菜单排序")
    private Long menuSort;

    /**
     * 菜单权限标识
     */
    @ApiModelProperty(value = "菜单权限标识")
    private String menuPerms;

    /**
     * 菜单名(不建议重复)
     */
    @ApiModelProperty(value = "菜单名(不建议重复)")
    private String name;

    /**
     * 菜单路径
     */
    @ApiModelProperty(value = "菜单路径")
    private String path;

    /**
     * 菜单路由
     */
    @ApiModelProperty(value = "菜单路由")
    private String component;

    /**
     * 菜单重定向
     */
    @ApiModelProperty(value = "菜单重定向")
    private String redirect;

    /**
     * 扩展信息-是否展示
     */
    @ApiModelProperty(value = "扩展信息-是否展示")
    private String metaShow;

    /**
     * 扩展信息-标题
     */
    @ApiModelProperty(value = "扩展信息-标题")
    private String metaTitle;

    /**
     * 扩展信息-菜单图标
     */
    @ApiModelProperty(value = "扩展信息-菜单图标")
    private String metaIcon;

    /**
     * 扩展信息-打开方式（ _BLANK新窗口）
     */
    @ApiModelProperty(value = "扩展信息-打开方式（ _BLANK新窗口）")
    private String metaTarget;

    /**
     * 扩展信息-是否隐藏子节点
     */
    @ApiModelProperty(value = "扩展信息-是否隐藏子节点")
    private String metaHideChildren;

    /**
     * 扩展信息-是否隐藏头部内容
     */
    @ApiModelProperty(value = "扩展信息-是否隐藏头部内容")
    private String metaHiddenHeaderContent;

    /**
     * 业务类型(预留)
     */
    @ApiModelProperty(value = "业务类型(预留)")
    private String businessType;

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

    /**
     * 菜单层级
     */
    @ApiModelProperty(value = "菜单层级")
    private Long menuLevel;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getMenuStatus() {
        return menuStatus;
    }

    public void setMenuStatus(String menuStatus) {
        this.menuStatus = menuStatus;
    }

    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType;
    }

    public Long getMenuSort() {
        return menuSort;
    }

    public void setMenuSort(Long menuSort) {
        this.menuSort = menuSort;
    }

    public String getMenuPerms() {
        return menuPerms;
    }

    public void setMenuPerms(String menuPerms) {
        this.menuPerms = menuPerms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public String getRedirect() {
        return redirect;
    }

    public void setRedirect(String redirect) {
        this.redirect = redirect;
    }

    public String getMetaShow() {
        return metaShow;
    }

    public void setMetaShow(String metaShow) {
        this.metaShow = metaShow;
    }

    public String getMetaTitle() {
        return metaTitle;
    }

    public void setMetaTitle(String metaTitle) {
        this.metaTitle = metaTitle;
    }

    public String getMetaIcon() {
        return metaIcon;
    }

    public void setMetaIcon(String metaIcon) {
        this.metaIcon = metaIcon;
    }

    public String getMetaTarget() {
        return metaTarget;
    }

    public void setMetaTarget(String metaTarget) {
        this.metaTarget = metaTarget;
    }

    public String getMetaHideChildren() {
        return metaHideChildren;
    }

    public void setMetaHideChildren(String metaHideChildren) {
        this.metaHideChildren = metaHideChildren;
    }

    public String getMetaHiddenHeaderContent() {
        return metaHiddenHeaderContent;
    }

    public void setMetaHiddenHeaderContent(String metaHiddenHeaderContent) {
        this.metaHiddenHeaderContent = metaHiddenHeaderContent;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
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

    public Long getMenuLevel() {
        return menuLevel;
    }

    public void setMenuLevel(Long menuLevel) {
        this.menuLevel = menuLevel;
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
        sb.append(", projectId=").append(projectId);
        sb.append(", parentId=").append(parentId);
        sb.append(", menuStatus=").append(menuStatus);
        sb.append(", menuType=").append(menuType);
        sb.append(", menuSort=").append(menuSort);
        sb.append(", menuPerms=").append(menuPerms);
        sb.append(", name=").append(name);
        sb.append(", path=").append(path);
        sb.append(", component=").append(component);
        sb.append(", redirect=").append(redirect);
        sb.append(", metaShow=").append(metaShow);
        sb.append(", metaTitle=").append(metaTitle);
        sb.append(", metaIcon=").append(metaIcon);
        sb.append(", metaTarget=").append(metaTarget);
        sb.append(", metaHideChildren=").append(metaHideChildren);
        sb.append(", metaHiddenHeaderContent=").append(metaHiddenHeaderContent);
        sb.append(", businessType=").append(businessType);
        sb.append(", sysFlag=").append(sysFlag);
        sb.append(", sysDept=").append(sysDept);
        sb.append(", sysCreateUser=").append(sysCreateUser);
        sb.append(", sysUpdateUser=").append(sysUpdateUser);
        sb.append(", sysCreateTime=").append(sysCreateTime);
        sb.append(", sysUpdateTime=").append(sysUpdateTime);
        sb.append(", sysRemark=").append(sysRemark);
        sb.append(", menuLevel=").append(menuLevel);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}