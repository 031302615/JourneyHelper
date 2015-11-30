package com.fzu.journeyhelper.dao.impl;

import java.util.List;

import com.fzu.common.dao.impl.BaseDaoHibernate4;
import com.fzu.journeyhelper.dao.ImageDao;
import com.fzu.journeyhelper.domain.MyImage;
import com.fzu.journeyhelper.domain.MyRoute;
import com.fzu.journeyhelper.domain.MyUser;

/**
 * 
 * Copyright (C): 2015-Hoatshon  
 * Project Name: JourneyHelper-Web     
 *  
 * Description:   
 * ClassName: com.fzu.journeyhelper.dao.impl.ImageDaoHibernate       
 * Author: Hoatson
 * Create Time: 2015��11��20�� ����6:04:52     
 * Modified By:   
 * Modified Time: 2015��11��20�� ����6:04:52     
 * Modified Remark:     
 * @version   V1.0
 */
public class ImageDaoHibernate extends BaseDaoHibernate4<MyImage> implements
		ImageDao {

	@Override
	public List<MyImage> findByRoute(MyRoute myRoute) {
		// TODO ���Ӳ�ѯ�г���Ƭ��¼
		return null;
	}

	@Override
	public List<MyImage> findByUser(MyUser myUser) {
		// TODO ���Ӳ�ѯ�û���Ƭ��¼
		return null;
	}

}
