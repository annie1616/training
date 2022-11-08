package com.learn.oops;

/*Polymorphism
 * Overloading-Employee1.class,HR.class
 * Overidding - Employee1.class,Sales.class
 */

public class Employee1 {
	
	Integer baseSalary=50000;
	
	void totalSalary(Integer basesalary,Integer bonus) {
		Integer total=basesalary+bonus;
		System.out.println("Employee class hrEmp1 Salary : " + total);;
	}
	

	void totalSalary(Integer basesalary,Integer bonus,Integer Incentive) {
		Integer total=basesalary+bonus+Incentive;
		System.out.println("Employee class sEmp1 Salary (incentive) : " + total);;
	}
	
	void working() {
		System.out.println("Employee is working");
	}
}
