package com.fzu.journeyhelper.service;

import java.util.Set;

import com.fzu.journeyhelper.domain.Route;
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
	
	public Set<User> findUsersList(Route route);
}
