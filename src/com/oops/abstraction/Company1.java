package com.oops.abstraction;

public class Company1 implements ITCompanies {

	@Override
	public void working() {
System.out.println("Company1 implements  IT company interface ");

	}
	
	public static void main(String[] args) {
		Company1 company=new Company1();
		company.working();
	}
	

}
