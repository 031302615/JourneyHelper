package com.fzu.action.authentication;

import com.fzu.model.User;
import com.opensymphony.xwork2.Action;

public class LoginAction implements Action {

	
	private User user;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	private String userName;
	private String passWord;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	@Override
	public String toString() {
		return "LoginAction [userName=" + userName + ", passWord=" + passWord
				+ "]";
	}

	@Override
	public String execute() throws Exception {

		System.out.println(getUserName());
		System.out.println(getPassWord());

		if (getPassWord().equals("2")) {
			System.out.println("error");
			return ERROR;
		} else {
			System.out.println("success");
			return SUCCESS;
		}

	}

	public String login() throws Exception {
		System.out.println(toString());
		
		user = new User();
		user.setUserName("test");
		user.setNickName("nicheng");
		user.setUserId("123");
		
		return SUCCESS;
	}


}
