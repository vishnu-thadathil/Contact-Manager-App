package com.project.ContactManager.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.project.ContactManager.model.User;
import com.project.ContactManager.service.ContactService;
import com.project.ContactManager.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;
	@Autowired
	ContactService contactService;
	@RequestMapping(value="/")
	public String welcome()
	{
		return "signin";
	}
	
	@RequestMapping(value="/signin")
	public String home()
	{
		return "signin";
	}
	@RequestMapping(value="/signin/do", method = RequestMethod.POST)
	public String signin(ModelMap model,HttpServletRequest req, HttpServletResponse res) {
		try {
			String email=req.getParameter("email");
			String password=req.getParameter("password");
			HttpSession session=req.getSession();
			User user=userService.findUser(email);
			if(!user.getPassword().equals(password))
			{
				model.put("message", "Invalid password");
				return "signin";
			}
			else
			{
				session.setAttribute("useremail", email);
				model.put("contact", contactService.findContacts(email));
				return "addcontact";
			}
		} catch (NullPointerException e) {
			// TODO: handle exception
			model.put("message", "Account not found");
			return "signin";
		}
	}
	@RequestMapping(value="/signup")
	public String signUpPage()
	{
		return "signup";
	}
	@RequestMapping(value="/signup/do", method = RequestMethod.POST)
	public String signup(ModelMap model, HttpServletRequest req, HttpServletResponse res) {
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		String secret=req.getParameter("secret");
		User user=new User();
		user.setEmail(email);
		user.setPassword(password);
		user.setSecret(secret);
		userService.addUser(user);
		model.put("message", "Account created");
		return "signin";
	}
}
