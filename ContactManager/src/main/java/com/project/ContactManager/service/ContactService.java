package com.project.ContactManager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.ContactManager.dao.ContactRepository;
import com.project.ContactManager.model.Contact;

@Service
public class ContactService {

	@Autowired
	ContactRepository contactRepository;
	
	public void addContact(Contact contact)
	{
		contactRepository.save(contact);
	}
	
	public List<Contact> findContacts(String useremail)
	{
		return contactRepository.findByUseremail(useremail);
	}
}
