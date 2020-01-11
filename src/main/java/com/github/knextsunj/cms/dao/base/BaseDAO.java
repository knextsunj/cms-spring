/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.knextsunj.cms.dao.base;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.github.knextsunj.cms.dao.GenericDAO;

/**
 *
 * @author kk
 * @param <T>
 */

public abstract class BaseDAO<T> implements GenericDAO<T> {

	private SessionFactory sessionFactory;

	public BaseDAO(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Serializable create(T t) {
		Session session = sessionFactory.getCurrentSession();
		System.out.println("TXN:"+session.getTransaction().isActive());
		Serializable serializable= session.save(t);
		return serializable;
	}

	@Override
	public void remove(Class<T> clazz,Serializable id) {
		Session session = sessionFactory.getCurrentSession();
		System.out.println("TXN:"+session.getTransaction().isActive());
		T t = session.get(clazz, id);
		session.delete(t);
	}

	protected SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Override
	public List<T> findAll(Class<T> clazz) {
		Session session = sessionFactory.getCurrentSession();
		System.out.println("TXN:"+session.getTransaction().isActive());
		Criteria criteria = session.createCriteria(clazz);
		List<T> list = criteria.list();
		return list;
	}
	
	@Override
	public T update(T t,Serializable id,Class clazz) {
		Session session = sessionFactory.getCurrentSession();
		 session.merge(t);
		return t;
	}
	
	@Override
	public T find(Class clazz,Serializable id) {
		Session session = sessionFactory.getCurrentSession();
		T t = (T) session.get(clazz, id);
		return t;
	}
	
}
