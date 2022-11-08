package com.learn.oops;
 
public class Student {
	
	Integer id;
	String name;
	Address address;
	
	public void addStudent(Integer id,String name ,Address address) {
		this.id=id;
		this.name=name;
		this.address=address;
		
	}


	void displayStudent() {
		System.out.println("Student details 1 : " + name + " " + address.city + " " +address.country);
	}
	public static void main(String[] args) {
		Address address=new Address("aaaa","TamilNadu","India");
		
		Student s1=new Student();
		s1.addStudent(1, "name1", address);
		s1.displayStudent();
	}



}
