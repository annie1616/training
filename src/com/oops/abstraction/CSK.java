package com.oops.abstraction;

public class CSK extends IPL{

	@Override
	void play() {
System.out.println("CSK implements IPL abstract class.All umimplemented classes should be implemented in CSK since it extends abstract class");


	}
	
	public static void main(String[] args) {
		CSK csk=new CSK();
		csk.play();
		
	}

}
