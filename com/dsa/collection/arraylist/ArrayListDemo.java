package com.dsa.collection.arraylist;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		// add element in array list
		al.add(20);
		al.add("Hardik");
		al.add(30);
		al.add(72);
		System.out.println(al);
		System.out.println("=========================\n");
		
		// size of arraylist
		int len=al.size();
		System.out.println(len);
		
		//System.out.println(al.size());
		System.out.println("=========================\n");
		
		
		// get element by index
		System.out.println(al.get(0));
		System.out.println(al.get(2));
		System.out.println("=========================\n");
		
		// add at particular index
		al.add(1, "hiii");
		System.out.println(al);
		System.out.println("==========================\n");
		
		// get index of particular object
		int i = al.indexOf("Hardik");
		System.out.println(i);
		//System.out.println(al.indexOf("Hardik"));
		System.out.println("=========================\n");
		
		// remove by index 
		System.out.println(al.remove(1));
		System.out.println("=========================\n");
		
		// replace the element
		al.set(0,"hiiiii");
		System.out.println(al);
		System.out.println("=========================\n");
		
		// remove all 
		al.removeAll(al);
		//System.out.println(al);
		//System.out.println("=========================\n");

		
		// clear list
		al.clear();
		System.out.println(al);
		System.out.println("==========================\n");
		
		
		
		
		
		
	}

}
