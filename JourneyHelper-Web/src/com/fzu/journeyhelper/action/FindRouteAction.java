package com.fzu.journeyhelper.action;

import java.util.Set;

import com.fzu.journeyhelper.domain.MyRoute;
import com.fzu.journeyhelper.domain.MyUser;

/**
 * 
 * Copyright (C): 2015-Hoatshon  
 * Project Name: JourneyHelper-Web     
 *  
 * Description:   
 * ClassName: com.fzu.journeyhelper.action.FindRouteAction       
 * Author: Hoatson
 * Create Time: 2015��11��20�� ����6:03:18     
 * Modified By:   
 * Modified Time: 2015��11��20�� ����6:03:18     
 * Modified Remark:     
 * @version   V1.0
 */
public class FindRouteAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// �����û���id��ѯ
	private Integer userId;

	// �����û�����ѯ
	private String userName;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	private Set<MyRoute> createList;
	private Set<MyRoute> joindeList;

	public Set<MyRoute> getCreateList() {
		return createList;
	}

	public void setCreateList(Set<MyRoute> createList) {
		this.createList = createList;
	}

	public Set<MyRoute> getJoindeList() {
		return joindeList;
	}

	public void setJoindeList(Set<MyRoute> joindeList) {
		this.joindeList = joindeList;
	}

	@Override
	public String execute() throws Exception {
		return null;
	}

	public String findCreateRouteList() throws Exception {
		MyUser myUser = new MyUser();
		myUser.setUserId(getUserId());
		myUser.setUserName(userName);
		createList = routeManager.findUserCreateRouteList(myUser);
		return SUCCESS;
	}

	public String findJoingRouteList() throws Exception {
		MyUser myUser = new MyUser();
		myUser.setUserId(getUserId());
		myUser.setUserName(userName);
		joindeList = routeManager.findUserJoinedRouteList(myUser);
		return SUCCESS;
	}

}
