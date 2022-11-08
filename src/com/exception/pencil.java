package com.exception;

import java.io.IOException;

class Pencil1 {
	void brokenPencil() throws IOException{
		throw new IOException("Pencil is broken .Throws is used to denote exception that the developer already know this error might occur. ");
	}
}

public class pencil {
	
	public static void main(String[] args) {
		try {
			Pencil1 p=new Pencil1();
				p.brokenPencil();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("Exception Completed");
	}

}
