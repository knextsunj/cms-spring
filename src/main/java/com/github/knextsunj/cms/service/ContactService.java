package com.github.knextsunj.cms.service;

import java.io.Serializable;
import java.util.List;

import com.github.knextsunj.cms.dto.ContactDTO;

public interface ContactService {
	
	Serializable addContact(ContactDTO contactDTO);

	ContactDTO updateContact(ContactDTO contactDTO);
	
	List<ContactDTO> fetchAllContacts();
	
	void removeContact(Serializable id);

}
