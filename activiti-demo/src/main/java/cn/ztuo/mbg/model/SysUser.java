package cn.ztuo.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

/**
 * 用户表
 *
 * @author ztuo
 * @date 2022-03-25 11:15:01
 */
public class SysUser implements Serializable {
    /**
     * 记录ID
     */
    @ApiModelProperty(value = "记录ID")
    private String id;

    /**
     * 登录账号
     */
    @ApiModelProperty(value = "登录账号")
    private String loginName;

    /**
     * 密码
     */
    @ApiModelProperty(value = "密码")
    private String password;

    /**
     * MD5加密盐
     */
    @ApiModelProperty(value = "MD5加密盐")
    private String salt;

    /**
     * 真实姓名
     */
    @ApiModelProperty(value = "真实姓名")
    private String realName;

    /**
     * 身份证号
     */
    @ApiModelProperty(value = "身份证号")
    private String idNumber;

    /**
     * 生日
     */
    @ApiModelProperty(value = "生日")
    private Date birthday;

    /**
     * 性别(0-默认未知,1-男,2-女)
     */
    @ApiModelProperty(value = "性别(0-默认未知,1-男,2-女)")
    private String sex;

    /**
     * 电子邮件
     */
    @ApiModelProperty(value = "电子邮件")
    private String email;

    /**
     * 座机号（电话及分机）
     */
    @ApiModelProperty(value = "座机号（电话及分机）")
    private String phone;

    /**
     * 手机
     */
    @ApiModelProperty(value = "手机")
    private String telephone;

    /**
     * 职务/岗位，关联岗位表
     */
    @ApiModelProperty(value = "职务/岗位，关联岗位表")
    private String post;

    /**
     * 工号
     */
    @ApiModelProperty(value = "工号")
    private String workNo;

    /**
     * 状态
     */
    @ApiModelProperty(value = "状态")
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

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
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

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getWorkNo() {
        return workNo;
    }

    public void setWorkNo(String workNo) {
        this.workNo = workNo;
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
        sb.append(", loginName=").append(loginName);
        sb.append(", password=").append(password);
        sb.append(", salt=").append(salt);
        sb.append(", realName=").append(realName);
        sb.append(", idNumber=").append(idNumber);
        sb.append(", birthday=").append(birthday);
        sb.append(", sex=").append(sex);
        sb.append(", email=").append(email);
        sb.append(", phone=").append(phone);
        sb.append(", telephone=").append(telephone);
        sb.append(", post=").append(post);
        sb.append(", workNo=").append(workNo);
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