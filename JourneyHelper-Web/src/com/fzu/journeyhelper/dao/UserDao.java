package com.fzu.journeyhelper.dao;

import java.util.List;

import com.fzu.journeyhelper.domain.Route;
import com.fzu.journeyhelper.domain.User;


public interface UserDao{
	
	/**
	 * ���ݱ�ʶ���Լ���Userʵ��
	 * @param id
	 * @return
	 */
	public User get(Integer id);
	
	/**
	 * �־û�ָ��ʵ��
	 * @param user
	 * @return
	 */
	public Integer save(User user);
	
	/**
	 * �޸ĳ־û�ʵ��
	 * @param user
	 */
	public void update(User user);
	
	/**
	 * ɾ���־û�ʵ��
	 * @param user
	 */
	public void delete(User user);
	
	/**
	 * ����idɾ���־û�ʵ��
	 * @param id
	 */
	public void delete(Integer id);
	
	/**
	 * ͨ���г̲�ѯ��Ա�б�
	 * @param route
	 * @return
	 */
	public List<User> findByRoute(Route route);
	
	/**
	 * ͨ���û�������������û�
	 * @param user
	 * @return
	 */
	public User findbyUserNameAndPass(User user);
	
	/**
	 * ͨ���û�����ѯ�û�
	 * @param user
	 * @return
	 */
	public User findbuUserName(User user);
	
	/**
	 * ��ѯ�û��Ƿ����
	 * @param user
	 * @return
	 */
	public boolean isExistByUserName(User user);
		
}
