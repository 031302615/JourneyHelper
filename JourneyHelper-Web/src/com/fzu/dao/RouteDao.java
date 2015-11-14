package com.fzu.dao;

import java.util.List;

import com.fzu.model.Route;
import com.fzu.model.User;

public interface RouteDao {

	
	/**
	 * ���ݱ�ʶ���Լ���Routeʵ��
	 * @param id
	 * @return
	 */
	public Route get(Integer id);
	
	/**
	 * �־û�ָ��ʵ��
	 * @param route
	 * @return
	 */
	public Integer save(Route route);
	
	/**
	 * �޸ĳ־û�ʵ��
	 * @param route
	 */
	public void update(Route route);
	
	/**
	 * ɾ���־û�ʵ��
	 * @param user
	 */
	public void delete(Route route);
	
	/**
	 * ����idɾ���־û�ʵ��
	 * @param id
	 */
	public void delete(Integer id);
	
	/**
	 * ��ѯ�û����г��б�
	 * @param user
	 * @return
	 */
	public List<Route> findUserlistByUser(User user);
	
	/**
	 * ��ѯ�û��Ĵ����б�
	 * @param user
	 * @return
	 */
	public List<Route> findCreatelistByUser(User user);
}
