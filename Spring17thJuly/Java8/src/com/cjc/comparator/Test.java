package com.cjc.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		Comparator<Student> rollnoSort = (s1, s2) -> s1.getRollno() - s2.getRollno();

				List<Student> stuList = new ArrayList<Student>();
				stuList.add(new Student(105, "ABC", "Pune"));
				stuList.add(new Student(102, "XYZ", "Mumbai"));
				stuList.add(new Student(101, "PQR", "Nashik"));
				stuList.add(new Student(103, "LMN", "Nagpur"));
				stuList.add(new Student(104, "MNO", "Buldana"));
				
				   for(Student stu:stuList) {
					   System.out.println("----------------------");
					   System.out.println(stu);
				   }
				   System.out.println("--------------------------");
				
			 Collections.sort(stuList,rollnoSort);
			 
			   for(Student stu:stuList) {
				   System.out.println("----------------------");
				   System.out.println(stu);
			   }
				
	}

	public static void java7withanonyousclass() {
		Comparator<Student> rollSort = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getRollno()-o2.getRollno();
			}
		};

		List<Student> stuList = new ArrayList<Student>();
		stuList.add(new Student(105, "ABC", "Pune"));
		stuList.add(new Student(102, "XYZ", "Mumbai"));
		stuList.add(new Student(101, "PQR", "Nashik"));
		stuList.add(new Student(103, "LMN", "Nagpur"));
		stuList.add(new Student(104, "MNO", "Buldana"));
		
		   for(Student stu:stuList) {
			   System.out.println("----------------------");
			   System.out.println(stu);
		   }
		   System.out.println("--------------------------");
		
	 Collections.sort(stuList,rollSort);
	 
	   for(Student stu:stuList) {
		   System.out.println("----------------------");
		   System.out.println(stu);
	   }
	}

	public static void java7aproachwithclassimpl() {
		List<Student> stuList = new ArrayList<Student>();
		stuList.add(new Student(105, "ABC", "Pune"));
		stuList.add(new Student(102, "XYZ", "Mumbai"));
		stuList.add(new Student(101, "PQR", "Nashik"));
		stuList.add(new Student(103, "LMN", "Nagpur"));
		stuList.add(new Student(104, "MNO", "Buldana"));
		
		   for(Student stu:stuList) {
			   System.out.println("----------------------");
			   System.out.println(stu);
		   }
		   System.out.println("--------------------------");
		
	 Collections.sort(stuList,new RollNoSort());
	 
	   for(Student stu:stuList) {
		   System.out.println("----------------------");
		   System.out.println(stu);
	   }

	}
}
