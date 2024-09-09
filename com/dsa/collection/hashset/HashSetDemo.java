package com.dsa.collection.hashset;

import java.util.HashSet;

public class HashSetDemo {
	
	public static void main(String[] args) {
		
		HashSet <Integer> hs = new HashSet();
		
		// ---------------- add -----------------
		
		// add object in hashset
		hs.add(10);
		hs.add(20);
		hs.add(30);
		System.out.println(hs);
		System.out.println("========================\n");
		
		//----------------------- get ----------
		
		// set have no direct get methods 
		// at it does not  follow insertion order
		
		// --------------------- remove ------------------
		
		// remove element ---- remove(object)
		hs.remove(10);
		System.out.println(hs);
		System.out.println("========================\n");
		
		// remove all object for hashset ---- remove()
		hs.removeAll(hs);
		System.out.println(hs);
		System.out.println("========================\n");
		
		// remove all object form hashset ---- clear()
		hs.clear();
		System.out.println(hs);
		System.out.println("========================\n");
		
		// ----------------- other methods -------------------
		
		// size --------- size()
		int len = hs.size();
		System.out.println(len);
		System.out.println("========================\n");
		
		//  Check the set is empty or not ---- isEmpty()
		boolean b=hs.isEmpty();
		System.out.println(b);
		System.out.println("========================\n");
			
	}

}
