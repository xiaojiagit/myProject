package org.mySelfBank.entity;

import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Date;


public class BankUser implements Serializable {
    /**
	* 密码
	*/
    private String userId;

    /**
	* 
	*/
    private String passWord;

    /**
	* 登录名
	*/
    private String loginName;

    /**
	* 明文密码
	*/
    private String passWordText;

    /**
	* 性别
	*/
    private String sex;

    /**
	* 姓名
	*/
    private String name;

    /**
	* 角色
	*/
    private String defaultRoleCode;

    /**
	* 删除状态  1:删除 0:未删除
	*/
    private String deleteFlag;

    /**
	* 创建时间
	*/
    private Date creTime;

    /**
	* 创建人
	*/
    private String creUser;

    private static final long serialVersionUID = 1L;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassWordText() {
        return passWordText;
    }

    public void setPassWordText(String passWordText) {
        this.passWordText = passWordText;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDefaultRoleCode() {
        return defaultRoleCode;
    }

    public void setDefaultRoleCode(String defaultRoleCode) {
        this.defaultRoleCode = defaultRoleCode;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Date getCreTime() {
        return creTime;
    }

    public void setCreTime(Date creTime) {
        this.creTime = creTime;
    }

    public String getCreUser() {
        return creUser;
    }

    public void setCreUser(String creUser) {
        this.creUser = creUser;
    }
}