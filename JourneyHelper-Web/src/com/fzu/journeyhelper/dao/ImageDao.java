package com.fzu.journeyhelper.dao;

import java.util.List;

import com.fzu.common.dao.BaseDao;
import com.fzu.journeyhelper.domain.Image;
import com.fzu.journeyhelper.domain.Route;
import com.fzu.journeyhelper.domain.User;

public interface ImageDao extends BaseDao<Image> {

	
	/**
	 * ��ѯ�г��е���Ƭǽ
	 * 
	 * @param route
	 * @return
	 */
	public List<Image> findByRoute(Route route);

	/**
	 * ��ѯ�û���������Ƭ
	 * 
	 * @param user
	 * @return
	 */
	public List<Image> findByUser(User user);
}
