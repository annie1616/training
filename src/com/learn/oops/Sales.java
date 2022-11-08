package com.learn.oops;

public class Sales extends Employee1 {

	Integer bonus=20000;
	Integer incentive;
	void working() {
		System.out.println("Sales is working");
	}
	public static void main(String[] args) {
		
	Sales sEmp1=new Sales();
	sEmp1.incentive=2000;
	
	sEmp1.totalSalary(sEmp1.baseSalary, sEmp1.bonus, sEmp1.incentive);
		sEmp1.working();
	}
}