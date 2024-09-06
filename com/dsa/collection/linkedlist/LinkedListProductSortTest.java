package com.dsa.collection.linkedlist;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;



public class LinkedListProductSortTest {

	public static void main(String[] args) {

		ProductSort p1 = new ProductSort(101, "Pen", 12.3, 2023, 3, 5);
		ProductSort p2 = new ProductSort(401, "Maggi", 14, 2025, 11, 5);
		ProductSort p3 = new ProductSort(203, "Chair", 310, 2030, 6, 21);
		ProductSort p4 = new ProductSort(212, "Pencil", 5.7, 2027, 1, 6);
		ProductSort p5 = new ProductSort(303, "Bag", 1200, 2028, 10, 31);

		LinkedList<ProductSort> plist = new LinkedList<>();
		plist.add(p1);
		plist.add(p2);
		plist.add(p3);
		plist.add(p4);
		plist.add(p5);

		System.out.println(plist);
		System.out.println("===================================\n");

		// -------------- sort ----------------------

		// compare by id --- Comparable
		Collections.sort(plist);
		plist.stream().forEach(s -> System.out.println(s));
		System.out.println("===================================\n");

		// sorting base on Name ---- Comparator
		Collections.sort(plist, new Pnamecomparator());
		plist.stream().forEach(s -> System.out.println(s));
		System.out.println("=============================\n");

		// sorting base on Price ---- Comparator
		Collections.sort(plist, new PpriceCompatator());
		plist.stream().forEach(s -> System.out.println(s));
		System.out.println("=============================\n");

		// sorting base on pexpdate ---- Comparator
		Collections.sort(plist, new PexpCompatator());
		plist.stream().forEach(s -> System.out.println(s));
		System.out.println("=============================\n");

	}

}
