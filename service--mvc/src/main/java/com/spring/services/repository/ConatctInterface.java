package com.spring.services.repository;

import java.util.List;

import com.spring.services.model.Contact;

/**
 * Defines Data Access Object operations for the Model class Contact
 * 
 * @author venka
 *
 */
public interface ConatctInterface {
	
	public List<Contact> list();
	public Contact get(int contactId);
	public void saveOrUpdate(Contact contact);
	public void delete(int contactId);
}
