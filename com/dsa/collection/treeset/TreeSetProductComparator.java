package com.dsa.collection.treeset;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSetProductComparator {
	
	public static void main(String[] args) {

		TreeSetProduct p1 = new TreeSetProduct(101, "Pen", 12.3, 2026, 3, 5);
		TreeSetProduct p2 = new TreeSetProduct(401, "Maggi", 14, 2025, 11, 5);
		TreeSetProduct p3 = new TreeSetProduct(203, "Chair", 310, 2030, 6, 21);
		TreeSetProduct p4 = new TreeSetProduct(212, "Pencil", 5.7, 2027, 1, 6);
		TreeSetProduct p5 = new TreeSetProduct(303, "Bag", 1200, 2028, 10, 31);
		
		// sorting base on Name ---- Comparator
		TreeSet<TreeSetProduct> ts = new TreeSet<>(new Pnamecomparator());
		ts.add(p1);
		ts.add(p2);
		ts.add(p3);
		ts.add(p4);
		ts.add(p5);

		System.out.println("===================================");

		ts.stream().forEach(s -> System.out.println(s));
		
		// sorting base on Price ---- Comparator
		TreeSet<TreeSetProduct> tsp = new TreeSet<>(new PpriceCompatator());
		tsp.add(p1);
		tsp.add(p2);
		tsp.add(p3);
		tsp.add(p4);
		tsp.add(p5);

		System.out.println("===================================");

		tsp.stream().forEach(s -> System.out.println(s));
		
		
		// sorting base on Expdate ---- Comparator
		TreeSet<TreeSetProduct> tse = new TreeSet<>(new PexpCompatator());
		tse.add(p1);
		tse.add(p2);
		tse.add(p3);
		tse.add(p4);
		tse.add(p5);

		System.out.println("===================================");

		tse.stream().forEach(s -> System.out.println(s));
		

		
		
	}

}
