package com.controller;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class HomeDao {

	@Autowired
	private SessionFactory sf;
	
	
	public String saveStudent()
	{
		
		
		return "";
	}
}
