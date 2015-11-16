package com.fzu.dao;

import java.util.List;

import com.fzu.model.Route;
import com.fzu.model.User;


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
		
}
