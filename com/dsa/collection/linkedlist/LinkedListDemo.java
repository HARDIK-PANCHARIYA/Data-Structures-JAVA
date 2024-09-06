package com.dsa.collection.linkedlist;

import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		LinkedList ll=new LinkedList();
		
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
		
		//------------------- size ----------------------
		int len = ll.size();
		System.out.println(len);
		System.out.println("==============================\n");
		
		
		//------------------ add method --------------------
		
		// adding element by index
		ll.add(1,2121);
		System.out.println(ll);
		System.out.println("==============================\n");
		
		// adding element at first
		ll.addFirst("hhhhiiiiii");
		System.out.println(ll);
		System.out.println("==============================\n");
		
		//adding element at last
		ll.addLast("bbyyy");
		System.out.println(ll);
		System.out.println("==============================\n");
		
		
		// ---------------- get methods -----------------
		
		// get element by index
		String s= (String) ll.get(1);
		System.out.println(s);
		System.out.println("==============================\n");
		
		// get last element
		System.out.println(ll.getLast());
		System.out.println("==============================\n");
		
		//get first element
		System.out.println(ll.getFirst());
		System.out.println("==============================\n");
		
		// ----------------- remove methods ---------------------
		System.out.println(ll.remove(0));
		
		System.out.println(ll.remove(2));
		
		System.out.println(ll.removeFirst());
		
		System.out.println(ll.removeFirstOccurrence(null));
		
		System.out.println(ll.removeLast());
		
		System.out.println(ll.removeAll(ll));
		
	}

}
