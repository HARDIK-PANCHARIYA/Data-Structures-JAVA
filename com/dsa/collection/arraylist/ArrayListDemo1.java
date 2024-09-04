package com.dsa.collection.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo1 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		// add element in arrayList
		al.add(20);
		al.add(30);
		al.add(72);
		al.add(1);
		System.out.println(al);
		System.out.println("=========================\n");

		// add array list in new ArrayList
		ArrayList al2 = new ArrayList(al);
		System.out.println(al);
		System.out.println("=========================\n");

		// Iterator single element one by one
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("=========================\n");

		// ListIterator single element one by one
		ListIterator litr = al.listIterator();
		while (litr.hasNext()) {
			System.out.println(litr.next());
		}
		System.out.println("=========================\n");

		// ListIterator single element one by one reverse order
		ListIterator ritr = al.listIterator(al.size());
		while (ritr.hasPrevious()) {
			System.out.println(ritr.previous());
		}
		System.out.println("=========================\n");
		
		// sort the ArrayList
		Collections.sort(al);
		System.out.println(al);
		System.out.println("=========================\n");
	}

}
