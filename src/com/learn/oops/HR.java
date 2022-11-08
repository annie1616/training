package com.learn.oops;
  
     

/*MultiLevel Inheritance*/


public class HR extends Employee1{
	
	Integer bonus=20000;
	Integer total=bonus+baseSalary;
	
	public static void main(String[] args) {
		HR hrEmp1 = new HR();
		System.out.println("hrEmp1 total : " +hrEmp1.total);
	}
}
