package com.fzu.journeyhelper.dao;

import java.util.List;

import com.fzu.common.dao.BaseDao;
import com.fzu.journeyhelper.domain.Route;
import com.fzu.journeyhelper.domain.User;

public interface UserDao extends BaseDao<User> {

	/**
	 * ͨ���г̲�ѯ��Ա�б�
	 * 
	 * @param route
	 * @return
	 */
	public List<User> findByRoute(Route route);

	/**
	 * ͨ���û�������������û�
	 * 
	 * @param user
	 * @return
	 */
	public User findbyUserNameAndPass(User user);

	/**
	 * ͨ���û�����ѯ�û�
	 * 
	 * @param user
	 * @return
	 */
	public User findbyUserName(User user);

	/**
	 * ��ѯ�û��Ƿ����
	 * 
	 * @param user
	 * @return
	 */
	public boolean isExistByUserName(User user);

}
