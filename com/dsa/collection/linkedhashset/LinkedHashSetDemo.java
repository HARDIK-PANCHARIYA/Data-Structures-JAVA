package com.dsa.collection.linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		LinkedHashSet<Integer> lh = new LinkedHashSet<Integer>();

		// ---------------------- add -----------------------

		// add object in linkedhashset
		lh.add(10);
		lh.add(30);
		lh.add(20);
		lh.add(50);
		lh.add(40);
		System.out.println(lh);
		System.out.println("========================\n");

		// --------- size ---------------
		System.out.println(lh.size());
		System.out.println("========================\n");

		// ----------------------- get ----------

		// set have no direct get methods
		// at it does not follow insertion order

		// so to get each object we have some option
		// for each , stream , Iterator

		// Iterator
		Iterator<Integer> itr = lh.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("====================================\n");

		// observed Insertion order maintain

		// for each stream API
		lh.stream().forEach(s -> System.out.println(s));
		System.out.println("====================================\n");

	}

}
