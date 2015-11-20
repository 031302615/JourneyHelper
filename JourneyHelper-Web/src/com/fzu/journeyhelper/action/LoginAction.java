package com.fzu.journeyhelper.action;

import com.fzu.journeyhelper.domain.User;

public class LoginAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// ��¼״̬���
	// 201��¼�ɹ�
	// 202�˺Ż����������
	private int status;
	private User user;
	private String userName;
	private String passWord;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

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

		return SUCCESS;

	}

	public String userLogin() throws Exception {
		System.out.println(toString());

		user = new User();
		user.setUserName(getUserName());
		user.setPassWord(getPassWord());

		User u = userManager.loginAuthen(user);
		if (u != null) {
			setUser(u);
			setStatus(201);
			return SUCCESS;
		} else {
			setStatus(202);
			return ERROR;
		}

	}

}
