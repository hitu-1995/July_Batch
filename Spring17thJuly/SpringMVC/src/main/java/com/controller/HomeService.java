package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class HomeService {

	@Autowired
	private HomeDao homedao;
	
	
	public String saveUser()
	{
		return "";
	}
	
	
}
