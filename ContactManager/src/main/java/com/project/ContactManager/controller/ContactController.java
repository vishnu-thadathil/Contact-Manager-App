package com.project.ContactManager.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.ContactManager.model.Contact;
import com.project.ContactManager.service.ContactService;

@Controller
public class ContactController {

	@Autowired
	ContactService contactService;
	@RequestMapping(value="addcontact")
	public String addcontact(ModelMap model, HttpServletRequest req,HttpServletResponse res)
	{
		HttpSession session=req.getSession();
		String name=req.getParameter("name");
		String ph=req.getParameter("ph");
		String email=req.getParameter("email");
		String useremail=(String) session.getAttribute("useremail");
		Contact contact=new Contact();
		contact.setName(name);
		contact.setPh(ph);
		contact.setEmail(useremail);
		contact.setUseremail(useremail);
		contactService.addContact(contact);
		model.put("contact", contactService.findContacts(useremail));
		return "addcontact";
	}
}
