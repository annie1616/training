package com.learn.oops;

/*Inheritance Example*/

class Employee {
	Integer baseSalary=50000;

}

public class Dev extends Employee{
	Integer bonus=25000;
	Integer total=bonus+baseSalary;
	
	public static void main(String[] args) {
		Dev emp1=new Dev();
		
		System.out.println("emp1 salary : "+emp1.total);
	}
}