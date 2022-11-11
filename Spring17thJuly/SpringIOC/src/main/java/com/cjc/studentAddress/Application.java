package com.cjc.studentAddress;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");
	
		Student student = context.getBean(Student.class);
		
		System.out.println(student.getName()+"...."+student.getAge()+"...."+student.getAddress().getCity()+"...."+student.getAddress().getArea());
		//System.out.println(student.getName()+"...."+student.getAge()+"...."+student.getAddress());
		System.out.println(context.isSingleton("student")+"...."+context.isSingleton("address"));
	}
}
