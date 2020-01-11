package com.github.knextsunj.cms.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.github.knextsunj.cms.dao.ContactDAO;
import com.github.knextsunj.cms.dao.base.BaseDAO;
import com.github.knextsunj.cms.domain.Contact;

@Repository
public class ContactDAOImpl extends BaseDAO<Contact> implements ContactDAO {

	@Autowired
	public ContactDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

}
