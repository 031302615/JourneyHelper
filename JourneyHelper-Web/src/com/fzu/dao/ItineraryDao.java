package com.fzu.dao;

import java.util.List;

import com.fzu.model.Itinerary;
import com.fzu.model.Route;

public interface ItineraryDao {
	
	/**
	 * ���ݱ�ʶ���Լ���Itineraryʵ��
	 * @param id
	 * @return
	 */
	public Itinerary get(Integer id);
	
	/**
	 * �־û�ָ��ʵ��
	 * @param itinerary
	 * @return
	 */
	public Integer save(Itinerary itinerary);
	
	/**
	 * �޸ĳ־û�ʵ��
	 * @param itinerary
	 */
	public void update(Itinerary itinerary);
	
	/**
	 * ɾ���־û�ʵ��
	 * @param itinerary
	 */
	public void delete(Itinerary itinerary);
	
	/**
	 * ����idɾ���־û�ʵ��
	 * @param id
	 */
	public void delete(Integer id);
	
	/**
	 * ͨ���г̵Ĺ滮�б�
	 * @param route
	 * @return
	 */
	public List<Itinerary> findByRoute(Route route);
}
