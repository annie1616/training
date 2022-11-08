package com.learn.oops;

/*Inheritance Example*/



public class Dev extends Employee1{
	Integer bonus=25000;
	Integer total=bonus + baseSalary;
	
	public static void main(String[] args) {
		Dev dEmp1=new Dev();
		
		System.out.println("dEmp1 salary : "+dEmp1.total);
	}
}