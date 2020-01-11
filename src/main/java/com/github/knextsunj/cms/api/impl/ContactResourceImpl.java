package com.github.knextsunj.cms.api.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.knextsunj.cms.api.ContactResource;
import com.github.knextsunj.cms.dto.ContactDTO;
import com.github.knextsunj.cms.service.ContactService;

@RestController
@RequestMapping("/contacts")
public class ContactResourceImpl implements ContactResource {
	
	@Autowired
	private ContactService contactService;

	@Override
	@PostMapping(path="/new" ,consumes="application/json", produces="application/json")
	public Serializable saveContact(@RequestBody ContactDTO contactDTO) {
		return contactService.addContact(contactDTO);
	}
	
	
	@GetMapping("/test")
	public String ping() {
		return "hello";
	}


	@Override
	@PutMapping(path="/update",consumes="application/json", produces="application/json")
	public ContactDTO updateContact(@RequestBody ContactDTO contactDTO) {
		return contactService.updateContact(contactDTO);
	}


	@Override
	@GetMapping(path="/all",produces="application/json")
	public List<ContactDTO> findAllContacts() {
		return contactService.fetchAllContacts();
	}


	@Override
	@DeleteMapping(path="/erase/{id}")
	public void removeContact(@PathVariable("id") Long id) {
		contactService.removeContact(id);		
	}
			
	

}
