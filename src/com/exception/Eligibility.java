package com.exception;

public class Eligibility {
	
	public static void Eligible(Integer exp)
	{
		if(exp>=10) {
			throw new ArithmeticException(">= 10 years. throw is used to send user-defined exceptions");
		
	}else
	{
		System.out.println("< 10 years");
		
	}

}
	
	public static void main(String[] args) {
		Eligible(8);
		
	}
	
}


