package com.dsa.collection.hashset;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {

	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet();

		// ---------------- add -----------------

		// add object in hashset
		hs.add(10);
		hs.add(20);
		hs.add(30);
		System.out.println(hs);
		System.out.println("========================\n");
		
		// --------- size ---------------
		System.out.println(hs.size());
		System.out.println("========================\n");

		// ----------------------- get ----------

		// set have no direct get methods
		// at it does not follow insertion order
		
		// so to get each object we have some option
		// for each , stream , Iterator
		
		// Iterator
		Iterator <Integer> itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("====================================\n");
		
		//  for each stream API
		hs.stream().forEach(s->System.out.println(s));
		System.out.println("====================================\n");
		
	}

}
