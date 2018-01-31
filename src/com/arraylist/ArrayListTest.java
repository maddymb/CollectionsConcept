package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListTest {

	public static void main(String []args) {
		
	
		ArrayList<Integer> ar= new ArrayList<Integer>();
	
		ar.add(10);
		ar.add(20);
		ar.add(90);
		
		
		System.out.println("*****Using Advanced For Loop********");
		for(int  a:ar) {
			System.out.println(a);
		}
		
		
		System.out.println("*****Using For Loop********");
		for(int i=0; i<ar.size(); i++) {
			
			System.out.println(ar.get(i));
			
		}
		
		
		System.out.println("*****Using For Iterator********");
		
		Iterator<Integer> it=ar.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}
	
		
}
