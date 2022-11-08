package com.learn.oops;
  
     

/*Polymorphism (method overloading)*/


public class HR extends Employee1{
	
	Integer bonus=20000;
	//Integer total=bonus+baseSalary;
	
	public static void main(String[] args) {
		HR hrEmp1 = new HR();
		
		hrEmp1.totalSalary(hrEmp1.baseSalary, hrEmp1.bonus);
		//System.out.println("hrEmp1 total : " +hrEmp1.total);
	}
}
