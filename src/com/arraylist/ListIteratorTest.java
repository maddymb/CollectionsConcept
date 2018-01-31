package com.arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorTest {

	public static void main(String[] args) {
		
		ArrayList<Integer> ar= new ArrayList<Integer>();
		
		ar.add(10);
		ar.add(23);
		ar.add(67);
		
		
		ListIterator<Integer> lit=ar.listIterator();
	
		System.out.println("******Forword Traverse******");
		
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
	
		
		System.out.println("******Backword Traverse******");
		
		
		while(lit.hasPrevious()) {		
			System.out.println(lit.previous());
		}
		
		
		
	}

}
