package com.exception;

public class FinallyException {
	
	public static void main(String[] args) {
		try {
			System.out.println("try block");
			
			int num=100/0;
			System.out.println(num);
		}catch (NullPointerException e) {
System.out.println(e);		}
	
	finally {
		System.out.println("if exception occurs or not,finally is executed ");
	}
System.out.println("Eception Handled");
}
	}
