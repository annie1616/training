package com.model;

public class Login {
	private String userName;
	private String password;
	private boolean status = false;

	public Login(String userName, String password, boolean status) {
		super();
		this.userName = userName;
		this.password = password;
		this.status = status;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Login [userName=" + userName + ", password=" + password + ", status=" + status + "]";
	}

}
