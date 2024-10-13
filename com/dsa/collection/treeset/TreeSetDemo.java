package com.dsa.collection.treeset;

import java.util.TreeSet;

public class TreeSetDemo {
	
public static void main(String[] args) {
		
		TreeSet <Integer> ts = new TreeSet();
		
		// ---------------- add -----------------
		
		// add object in treeset
		ts.add(10);
		ts.add(100);
		ts.add(30);
		System.out.println(ts);
		System.out.println("========================\n");
		
		//----------------------- get ----------
		
		// set have no direct get methods 
		// at it does not  follow insertion order
		
		// --------------------- remove ------------------
		
		// remove element ---- remove(object)
		ts.remove(10);
		System.out.println(ts);
		System.out.println("========================\n");
		
		// remove all object for treeset ---- remove()
		ts.removeAll(ts);
		System.out.println(ts);
		System.out.println("========================\n");
		
		// remove all object form treeset ---- clear()
		ts.clear();
		System.out.println(ts);
		System.out.println("========================\n");
		
		// ----------------- other methods -------------------
		
		// size --------- size()
		int len = ts.size();
		System.out.println(len);
		System.out.println("========================\n");
		
		//  Check the set is empty or not ---- isEmpty()
		boolean b=ts.isEmpty();
		System.out.println(b);
		System.out.println("========================\n");
			
	}

}
