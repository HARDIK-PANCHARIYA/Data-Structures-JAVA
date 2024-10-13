package com.dsa.collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo1 {
	
public static void main(String[] args) {
		
		TreeSet<Integer> ts = new TreeSet();

		// ---------------- add -----------------

		// add object in treeset
		ts.add(10);
		ts.add(210);
		ts.add(30);
		System.out.println(ts);
		System.out.println("========================\n");
		
		// --------- size ---------------
		System.out.println(ts.size());
		System.out.println("========================\n");

		// ----------------------- get ----------

		// set have no direct get methods
		// at it does not follow insertion order
		
		// so to get each object we have some option
		// for each , stream , Iterator
		
		// Iterator
		Iterator <Integer> itr = ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("====================================\n");
		
		//  for each stream API
		ts.stream().forEach(s->System.out.println(s));
		System.out.println("====================================\n");
		
	}

}
