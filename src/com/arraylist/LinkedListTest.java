package com.arraylist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {

	public static <E> void main(String[] args) {
		
		LinkedList<String> ll=new LinkedList<String>();
		
		ll.add("srishti");
		ll.add("madhur");
		ll.addFirst("bharadwaj");
		ll.addLast("sharma");
		
		
		for(String name:ll) {
			System.out.println(name);
			
		}
		
		
		Iterator<String> it=ll.iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
				 
		
	}

}
