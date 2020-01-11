package com.github.knextsunj.cms.api;

import java.io.Serializable;
import java.util.List;

import com.github.knextsunj.cms.dto.ContactDTO;

public interface ContactResource {
	
	Serializable saveContact(ContactDTO contactDTO);
	
	ContactDTO updateContact(ContactDTO contactDTO);

	List<ContactDTO> findAllContacts();
	
	void removeContact(Long id);
}
