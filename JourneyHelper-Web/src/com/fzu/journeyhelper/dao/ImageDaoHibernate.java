package com.fzu.journeyhelper.dao;

import java.util.List;

import com.fzu.journeyhelper.domain.Image;
import com.fzu.journeyhelper.domain.Route;
import com.fzu.journeyhelper.domain.User;

public class ImageDaoHibernate extends PagingHibernateDaoSupport implements
		ImageDao {

	@Override
	public Image get(Integer id) {
		return (Image) getSessionFactory().getCurrentSession().get(Image.class, id);
	}

	@Override
	public Integer save(Image image) {
		return (Integer) getSessionFactory().getCurrentSession().save(image);
	}

	@Override
	public void update(Image image) {
		getSessionFactory().getCurrentSession().update(image);
	}

	@Override
	public void delete(Image image) {
		getSessionFactory().getCurrentSession().delete(image);
	}

	@Override
	public void delete(Integer id) {
		getSessionFactory().getCurrentSession().delete(get(id));
	}

	@Override
	public List<Image> findByRoute(Route route) {
		// TODO ���Ӳ�ѯ�г���Ƭ��¼
		return null;
	}

	@Override
	public List<Image> findUserImageByUser(User user) {
		// TODO ���Ӳ�ѯ�û���Ƭ��¼
		return null;
	}

}
