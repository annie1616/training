package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> alist = new ArrayList<>();
		alist.add("name1");
		alist.add("name2");
		alist.add("name3");
		alist.add("name4");
		alist.add("name5");
		alist.add(4,"addposition");
		
		
		Iterator itr=alist.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	
		

	}
}
