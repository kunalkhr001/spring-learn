package com.example.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.UserValidationService;

@Controller
public class LoginController {
	
	@Autowired
	UserValidationService service;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginPage()
	{
		return "login";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String handleLogin(@RequestParam String name, ModelMap model)
	{
		if(!service.validate(name))
		{
			model.put("errorMessage", "Invalid creds"); 
			return "login";
		}
		model.put("name", name); 
		return "welcome";
	}
}
