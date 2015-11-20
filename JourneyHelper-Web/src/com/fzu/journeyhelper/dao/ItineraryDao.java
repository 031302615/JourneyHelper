package com.fzu.journeyhelper.dao;

import java.util.List;

import com.fzu.common.dao.BaseDao;
import com.fzu.journeyhelper.domain.Itinerary;
import com.fzu.journeyhelper.domain.Route;

public interface ItineraryDao extends BaseDao<Itinerary> {

	/**
	 * ͨ���г̵Ĺ滮�б�
	 * 
	 * @param route
	 * @return
	 */
	public List<Itinerary> findByRoute(Route route);
}
