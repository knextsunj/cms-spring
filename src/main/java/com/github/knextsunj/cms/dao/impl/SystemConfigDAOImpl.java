package com.github.knextsunj.cms.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.github.knextsunj.cms.dao.SystemConfigDAO;
import com.github.knextsunj.cms.dao.base.BaseDAO;
import com.github.knextsunj.cms.domain.SystemConfig;

@Repository
public class SystemConfigDAOImpl extends BaseDAO<SystemConfig> implements SystemConfigDAO {

	@Autowired
	public SystemConfigDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	@Override
	public SystemConfig getSystemConfigByKey(String key) {
		Session session = super.getSessionFactory().getCurrentSession();
		Criteria criteria = session.createCriteria(SystemConfig.class);
		criteria.add(Restrictions.eq("key", key));
		return (SystemConfig) criteria.uniqueResult();
	}
}
