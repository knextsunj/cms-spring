package com.github.knextsunj.cms.dto.assembler;

import java.util.Objects;

import com.github.knextsunj.cms.domain.Anniversary;
import com.github.knextsunj.cms.domain.Contact;
import com.github.knextsunj.cms.dto.ContactDTO;
import com.github.knextsunj.cms.util.DateTimeUtil;

public class ContactDTOAssembler {

	public Contact buildContact(ContactDTO contactDTO) {
		Contact contact = new Contact();

		if (Objects.nonNull(contactDTO.getId())) {
			contact.setId(contactDTO.getId());
		}

		contact.setName(contactDTO.getName());
		contact.setEmailAddress(contactDTO.getEmailAddress());

		Anniversary anniversary = new Anniversary();
		anniversary.setDateOfBirth(contactDTO.getDateOfBirth());
		anniversary.setAnniversaryDate(contactDTO.getAnniversaryDate());

		contact.setAnniversary(anniversary);

		contact.setCreatedDate(DateTimeUtil.getPresentDateTimeInUTC());
		contact.setUpdatedDate(DateTimeUtil.getPresentDateTimeInUTC());
		return contact;
	}

	public ContactDTO buildContactDTO(Contact contact) {
		ContactDTO contactDTO = new ContactDTO();
		contactDTO.setId(contact.getId());
		contactDTO.setName(contact.getName());
		contactDTO.setEmailAddress(contact.getEmailAddress());
		contactDTO.setDateOfBirth(contact.getAnniversary().getDateOfBirth());
		contactDTO.setAnniversaryDate(contact.getAnniversary().getAnniversaryDate());

		return contactDTO;
	}
}
