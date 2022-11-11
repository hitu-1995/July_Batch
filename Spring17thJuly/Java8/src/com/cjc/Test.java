package com.cjc;

public class Test {

	public static void main(String[] args) {
		System.out.println("main--start");
	
		  I1 i = (str) -> str.toUpperCase();
		
		  String case1 = i.changeCase("abcd");
		  
		   System.out.println(case1);
		 
		System.out.println("main--ends");
	}
}
