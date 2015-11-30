package com.fzu.journeyhelper.service;

import java.util.Set;

import com.fzu.journeyhelper.domain.MyRoute;
import com.fzu.journeyhelper.domain.MyUser;

/**
 * 
 * Copyright (C): 2015-Hoatshon  
 * Project Name: JourneyHelper-Web     
 *  
 * Description:   
 * ClassName: com.fzu.journeyhelper.service.UserManager       
 * Author: Hoatson
 * Create Time: 2015��11��20�� ����6:06:17     
 * Modified By:   
 * Modified Time: 2015��11��20�� ����6:06:17     
 * Modified Remark:     
 * @version   V1.0
 */
public interface UserManager {

	public MyUser loginAuthen(MyUser myUser);

	public Integer registNewUser(MyUser myUser);

	/**
	 * �ж����û��Ƿ����ע��
	 * @param myUser
	 * @return
	 */
	public boolean registAvaliable(MyUser myUser);
	
	public Set<MyUser> findUsersList(MyRoute myRoute);
}
