package com.spring.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 
 */
@Entity
public class User implements Serializable {

    private static final long serialVersionUId = 1L;

    @Id
    @GeneratedValue
    private int userId;
    private String loginName;
    private String loginPwd;
    private String name;

    public User(){
        super();
    }

    public static long getSerialVersionUId() {
        return serialVersionUId;
    }

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getLoginPwd() {
		return loginPwd;
	}

	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
    


}