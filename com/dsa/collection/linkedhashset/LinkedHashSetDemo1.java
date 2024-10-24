package com.dsa.collection.linkedhashset;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo1 {

	public static void main(String[] args) {

		LinkedHashSet<Integer> lh = new LinkedHashSet<Integer>();

		// ---------------------- add -----------------------

		// add object in linkedhaslhet
		lh.add(10);
		lh.add(30);
		lh.add(20);
		lh.add(50);
		lh.add(40);
		System.out.println(lh);
		System.out.println("========================\n");

		// ----------------------- get ----------

		// as it follow insertion order but
		// set have no direct get methods

		// --------------------- remove ------------------

		// remove element ---- remove(object)
		lh.remove(10);
		System.out.println(lh);
		System.out.println("========================\n");

		// remove all object for linkedhashset ---- remove()
		lh.removeAll(lh);
		System.out.println(lh);
		System.out.println("========================\n");

		// remove all object form linkedhashset ---- clear()
		lh.clear();
		System.out.println(lh);
		System.out.println("========================\n");

		// ----------------- other methods -------------------

		// size --------- size()
		int len = lh.size();
		System.out.println(len);
		System.out.println("========================\n");

		// Check the set is empty or not ---- isEmpty()
		boolean b = lh.isEmpty();
		System.out.println(b);
		System.out.println("========================\n");

	}

}
