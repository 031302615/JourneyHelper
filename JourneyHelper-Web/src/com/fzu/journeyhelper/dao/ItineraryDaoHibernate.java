package com.fzu.journeyhelper.dao;

import java.util.List;

import com.fzu.journeyhelper.domain.Itinerary;
import com.fzu.journeyhelper.domain.Route;

public class ItineraryDaoHibernate extends PagingHibernateDaoSupport implements
		ItineraryDao {

	@Override
	public Itinerary get(Integer id) {
		return (Itinerary) getSessionFactory().getCurrentSession().get(
				Itinerary.class, id);
	}

	@Override
	public Integer save(Itinerary itinerary) {
		return (Integer) getSessionFactory().getCurrentSession()
				.save(itinerary);
	}

	@Override
	public void update(Itinerary itinerary) {
		getSessionFactory().getCurrentSession().update(itinerary);
	}

	@Override
	public void delete(Itinerary itinerary) {
		getSessionFactory().getCurrentSession().delete(itinerary);
	}

	@Override
	public void delete(Integer id) {
		getSessionFactory().getCurrentSession().delete(get(id));
	}

	@Override
	public List<Itinerary> findByRoute(Route route) {
		// TODO ���Ӳ�ѯ�г̵Ĺ滮
		return null;
	}

}
