package com.fzu.journeyhelper.dao;

import java.util.Set;

import com.fzu.common.dao.BaseDao;
import com.fzu.journeyhelper.domain.MyRoute;
import com.fzu.journeyhelper.domain.MyUser;

/**
 * 
 * Copyright (C): 2015-Hoatshon  
 * Project Name: JourneyHelper-Web     
 *  
 * Description:   
 * ClassName: com.fzu.journeyhelper.dao.RouteDao       
 * Author: Hoatson
 * Create Time: 2015��11��20�� ����6:04:14     
 * Modified By:   
 * Modified Time: 2015��11��20�� ����6:04:14     
 * Modified Remark:     
 * @version   V1.0
 */
public interface RouteDao extends BaseDao<MyRoute> {

	/**
	 * ��ѯ�û����г��б�
	 * 
	 * @param myUser
	 * @return
	 */
	public Set<MyRoute> findRoutelistByUser(MyUser myUser);

	/**
	 * ��ѯ�û��Ĵ����б�
	 * 
	 * @param myUser
	 * @return
	 */
	public Set<MyRoute> findCreatelistByUser(MyUser myUser);
}
