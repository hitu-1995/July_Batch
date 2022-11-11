package com.cjc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		BeanScopeDemo product =  (BeanScopeDemo) context.getBean("beanscope");
		
		//System.out.println(product.getName()+"...."+product.getPrice());
		System.out.println(context.isSingleton("beanscope"));
		System.out.println(context.isPrototype("beanscope"));
		
		BeanScopeDemo product1 =  (BeanScopeDemo) context.getBean("beanscope");
		
		System.out.println(product.hashCode());
		System.out.println(product1.hashCode());
	}
}
