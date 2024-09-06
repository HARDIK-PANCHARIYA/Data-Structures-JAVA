package com.dsa.collection.linkedlist;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		
		
		LinkedList ll=new LinkedList();
		
		// ------------------- add ----------------------
		
		// adding element to linked list
		ll.add("Hardik");
		ll.add('s');
		ll.add("Panchariya");
		ll.add(21);
		ll.add(0.3);
		ll.add(1999);
		ll.add("Hardik");
		ll.add(null);
		ll.add(null);
		System.out.println(ll);
		System.out.println("==============================\n");

		// ------------------- size ----------------------
		int len = ll.size();
		System.out.println(len);
		System.out.println("==============================\n");
		
		LinkedList ll2=new LinkedList();
		ll2.add(112);
		
		//------------------- add list to list  -----------------------
		ll2.add(ll);
		System.out.println(ll2);
		System.out.println("====================================\n");
		
		
		// ---------------- iterate one by one objects --------------------
		
		// for
		for(int i=0; i<ll.size(); i++) {
			System.out.println(ll.get(i));
		}
		System.out.println("====================================\n");
		
		// for each stream API
		ll.stream().forEach(s->System.out.println(s));
		System.out.println("====================================\n");
		
		// Iterator
		Iterator itr = ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("====================================\n");
				
		// List Iterator for reverse order
		ListIterator litr = ll.listIterator(ll.size());
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
		

	}

}
