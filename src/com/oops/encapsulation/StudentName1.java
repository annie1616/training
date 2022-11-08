package com.oops.encapsulation;

public class StudentName1 {
	
	public static void main(String[] args) {
		Student s=new Student(); //object of encapsulated instance
		
		s.setId(1);
		s.setName("name1");
		s.setClassName("8");
		s.setTotalMarks(97);
		
		System.out.println(s.getName());
	}
	
	
	

}
