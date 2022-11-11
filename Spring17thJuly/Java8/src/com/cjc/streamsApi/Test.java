package com.cjc.streamsApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {

		 List<Integer> list = Arrays.asList(2,3,5,1,6,7,8);	 
		 Optional<Integer> min = list.stream().min((n1,n2) -> n1-n2);
		 Optional<Integer> max= list.stream().max((n1,n2) -> n1-n2);
		 System.out.println(min.get());
		 System.out.println(max.get());
	
	}

	public static void functionExample() {
		Function<Integer, Integer> cube = (n) -> n*n*n;
		      Integer c = cube.apply(3);
		      System.out.println(c);
	}

	public static void consumerexample() {
		System.out.println("main---start");
			Consumer<Integer> msg = (n) -> System.out.println("The Number Is : "+n);	
			  msg.accept(10);
			System.out.println("main---ends");
	}

	public static void distinctNameSalaryWise() {
		List<Employee> list = Arrays.asList( new Employee(101, "ABC", 56000),
		         new Employee(102, "PQR", 44000),
		         new Employee(103, "ABC", 51000),
		         new Employee(104, "LMN", 23000)); 

          List<String> names = list.stream()
        		                 .filter((emp) -> emp.getSalary()>50000)
                                 .map((emp) -> emp.getEname())
                                 .distinct()
                                 .collect(Collectors.toList());

     for(String str:names) {
   	  System.out.println("----------------------");
   	  System.out.println(str);
     }
	}

	public static void salaryGreaterNames() {
		List<Employee> list = Arrays.asList( new Employee(101, "ABC", 56000),
				         new Employee(102, "PQR", 44000),
				         new Employee(103, "XYZ", 51000),
				         new Employee(104, "LMN", 23000)); 

	List<String> names = list.stream().filter((emp) -> emp.getSalary()>50000)
		                                 .map((emp) -> emp.getEname())
		                                 .collect(Collectors.toList());
		
	          for(String str:names) {
	        	  System.out.println("----------------------");
	        	  System.out.println(str);
	          }
	}

	public static void salaryGreaterThan(List<Employee> list) {
		List<Employee> empListSalary= list.stream()
				                                 .filter((emp) -> emp.getSalary()>50000)
				                                 .collect(Collectors.toList());
				
		         for(Employee emp : list) {
		        	 System.out.println("--------------------");
		        	 System.out.println(emp);
		         }
		         System.out.println("***********************************************");
		         for(Employee emp : empListSalary) {
		        	 System.out.println("--------------------");
		        	 System.out.println(emp);
		         }
	}

	public static void evenSqures() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(2);
		list.add(1);
		list.add(6);

		
		Function<Integer, Integer> sq = (n) -> n*n;
		
		Integer integer = sq.apply(5);
		System.out.println(integer);
		
		
		List<Integer> evenListSqures = list.stream()
				                                .filter((n) -> n%2 == 0)
				                                .map(sq)
				                                .collect(Collectors.toList());
		System.out.println(list);
		System.out.println(evenListSqures);
	}

	public static void removeDuplicate(List<Integer> list) {
		List<Integer> unique = list.stream().distinct().collect(Collectors.toList());
		System.out.println(list);
		System.out.println(unique);
	}

	public static void evenList(List<Integer> list) {
		List<Integer> evenList = list.stream().filter((n) -> n%2 == 0).collect(Collectors.toList());
	    System.out.println(list);
	    System.out.println(evenList);
	}
}
