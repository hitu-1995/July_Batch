package com.cjc.springBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		System.out.println("Spring Application start");
		ApplicationContext context= SpringApplication.run(SpringBootDemoApplication.class, args);
//		String[] beans=context.getBeanDefinitionNames();
//		for(String bean: beans) {
//			System.out.println(bean);
//		}
	}

}
