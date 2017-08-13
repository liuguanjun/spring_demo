package com.example.demo.domain;

public class DemoUser {
	
	private Long id;
	
	private String loginName;
	
	private String userName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "DemoUser [id=" + id + ", loginName=" + loginName + ", userName=" + userName + "]";
	}
	

}
