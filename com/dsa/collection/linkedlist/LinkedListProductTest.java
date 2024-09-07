package com.dsa.collection.linkedlist;

import java.util.Collections;
import java.util.LinkedList;



public class LinkedListProductTest {

	public static void main(String[] args) {

		Product p1 = new Product(101, "Pen", 12.3, 2026, 3, 5);
		Product p2 = new Product(401, "Maggi", 14, 2025, 11, 5);
		Product p3 = new Product(203, "Chair", 310, 2030, 6, 21);
		Product p4 = new Product(212, "Pencil", 5.7, 2027, 1, 6);
		Product p5 = new Product(303, "Bag", 1200, 2028, 10, 31);

		LinkedList<Product> plist = new LinkedList<>();
		plist.add(p1);
		plist.add(p2);
		plist.add(p3);
		plist.add(p4);
		plist.add(p5);

		System.out.println(plist);
		System.out.println("===================================");

		// ---------------- iterate each object of product --------------

		// enhance for
		for (Product i : plist) {
			System.out.println(i);
		}
		System.out.println("===================================");

		// for each stream API
		plist.stream().forEach(s -> System.out.println(s));
		System.out.println("===================================");
		
		
		//-------------------- object operation -------------------------- 
		// decrease the product price by 10%
		for (Product e : plist) {
			e.setPprice(e.getPprice() * 0.90);
		}
		plist.stream().forEach(s -> System.out.println(s));
		System.out.println("===================================");

	}

}
