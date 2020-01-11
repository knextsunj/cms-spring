package com.github.knextsunj.cms.service.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.knextsunj.cms.dao.ContactDAO;
import com.github.knextsunj.cms.domain.Contact;
import com.github.knextsunj.cms.dto.ContactDTO;
import com.github.knextsunj.cms.dto.assembler.ContactDTOAssembler;
import com.github.knextsunj.cms.service.ContactService;

@Service
public class ContactServiceImpl implements ContactService,InitializingBean{
	
	private static final Logger logger = LogManager.getLogger(ContactServiceImpl.class);
	
	private ContactDTOAssembler contactDTOAssembler;
	
	@Autowired
	private ContactDAO contactDAO;


	@Override
	@Transactional
	public Serializable addContact(ContactDTO contactDTO) {
		Serializable id = contactDAO.create(contactDTOAssembler.buildContact(contactDTO));
		logger.info("Contact saved with id: {}",id);
		return id;
	}

	@Override
	@Transactional
	public ContactDTO updateContact(ContactDTO contactDTO) {
		logger.info("Before update contact is: {}",contactDTO.getId());
		Contact contact = contactDTOAssembler.buildContact(contactDTO);
		Contact updatedContact = contactDAO.update(contact,contact.getId(),Contact.class);
		logger.info("After update contact is: {}",updatedContact.getId());
		return contactDTOAssembler.buildContactDTO(contact);
	}


	public void afterPropertiesSet() throws Exception {
		this.contactDTOAssembler = new ContactDTOAssembler();
		
	}

	@Override
	@Transactional
	public List<ContactDTO> fetchAllContacts() {
		List<ContactDTO> contactDTOList = new ArrayList<>();
		List<Contact> contacts = contactDAO.findAll(Contact.class);
		for(Contact contact: contacts) {
			contactDTOList.add(contactDTOAssembler.buildContactDTO(contact));
		}
		return contactDTOList;
	}

	@Override
	@Transactional
	public void removeContact(Serializable id) {
		contactDAO.remove(Contact.class,id);
		
	}

}
