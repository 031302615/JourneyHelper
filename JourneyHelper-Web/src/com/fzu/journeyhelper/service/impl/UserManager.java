package com.fzu.journeyhelper.service.impl;

import com.fzu.journeyhelper.domain.User;

public interface UserManager {

	public User loginAuthen(User user);

	public Integer registNewUser(User user);

	/**
	 * �ж����û��Ƿ����ע��
	 * @param user
	 * @return
	 */
	public boolean registAvaliable(User user);
	

}
