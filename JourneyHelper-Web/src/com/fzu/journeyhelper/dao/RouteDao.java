package com.fzu.journeyhelper.dao;

import java.util.Set;

import com.fzu.common.dao.BaseDao;
import com.fzu.journeyhelper.domain.Route;
import com.fzu.journeyhelper.domain.User;

public interface RouteDao extends BaseDao<Route> {

	/**
	 * ��ѯ�û����г��б�
	 * 
	 * @param user
	 * @return
	 */
	public Set<Route> findRoutelistByUser(User user);

	/**
	 * ��ѯ�û��Ĵ����б�
	 * 
	 * @param user
	 * @return
	 */
	public Set<Route> findCreatelistByUser(User user);
}
