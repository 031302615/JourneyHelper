package com.fzu.journeyhelper.dao;

import com.fzu.common.dao.BaseDao;
import com.fzu.journeyhelper.domain.MyUser;

/**
 * 
 * Copyright (C): 2015-Hoatshon  
 * Project Name: JourneyHelper-Web     
 *  
 * Description:   
 * ClassName: com.fzu.journeyhelper.dao.UserDao       
 * Author: Hoatson
 * Create Time: 2015��11��20�� ����6:04:23     
 * Modified By:   
 * Modified Time: 2015��11��20�� ����6:04:23     
 * Modified Remark:     
 * @version   V1.0
 */
public interface UserDao extends BaseDao<MyUser> {


	/**
	 * ͨ���û�������������û�
	 * 
	 * @param myUser
	 * @return
	 */
	public MyUser findbyUserNameAndPass(MyUser myUser);

	/**
	 * ͨ���û�����ѯ�û�
	 * 
	 * @param myUser
	 * @return
	 */
	public MyUser findbyUserName(MyUser myUser);

	/**
	 * ��ѯ�û��Ƿ����
	 * 
	 * @param myUser
	 * @return
	 */
	public boolean isExistByUserName(MyUser myUser);

}
