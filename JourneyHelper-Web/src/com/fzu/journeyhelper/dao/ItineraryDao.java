package com.fzu.journeyhelper.dao;

import java.util.List;

import com.fzu.common.dao.BaseDao;
import com.fzu.journeyhelper.domain.MyItinerary;
import com.fzu.journeyhelper.domain.MyRoute;

/**
 * 
 * Copyright (C): 2015-Hoatshon  
 * Project Name: JourneyHelper-Web     
 *  
 * Description:   
 * ClassName: com.fzu.journeyhelper.dao.ItineraryDao       
 * Author: Hoatson
 * Create Time: 2015��11��20�� ����6:04:05     
 * Modified By:   
 * Modified Time: 2015��11��20�� ����6:04:05     
 * Modified Remark:     
 * @version   V1.0
 */
public interface ItineraryDao extends BaseDao<MyItinerary> {

	/**
	 * ͨ���г̵Ĺ滮�б�
	 * 
	 * @param myRoute
	 * @return
	 */
	public List<MyItinerary> findByRoute(MyRoute myRoute);
}
