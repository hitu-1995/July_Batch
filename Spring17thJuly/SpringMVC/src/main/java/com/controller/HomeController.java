package com.controller;

import java.sql.DriverManager;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	

	@RequestMapping("/")
	public String landingPage()
	{
		return "index";
	}
	@RequestMapping("/reg")
	public String loginPage(@PathVariable int id,@PathVariable String name,@PathVariable String pass)
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(pass);
		return "register";
	}
	
	 
	
}
