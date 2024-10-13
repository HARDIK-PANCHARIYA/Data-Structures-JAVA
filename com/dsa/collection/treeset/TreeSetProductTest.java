package com.dsa.collection.treeset;
import java.util.TreeSet;

public class TreeSetProductTest {
	
	public static void main(String[] args) {

		TreeSetProduct p1 = new TreeSetProduct(101, "Pen", 12.3, 2026, 3, 5);
		TreeSetProduct p2 = new TreeSetProduct(401, "Maggi", 14, 2025, 11, 5);
		TreeSetProduct p3 = new TreeSetProduct(203, "Chair", 310, 2030, 6, 21);
		TreeSetProduct p4 = new TreeSetProduct(212, "Pencil", 5.7, 2027, 1, 6);
		TreeSetProduct p5 = new TreeSetProduct(303, "Bag", 1200, 2028, 10, 31);

		TreeSet<TreeSetProduct> ts = new TreeSet<>();
		ts.add(p1);
		ts.add(p2);
		ts.add(p3);
		ts.add(p4);
		ts.add(p5);

		System.out.println(ts);
		System.out.println("===================================");

		// ---------------- iterate each object of TreeSetProduct --------------

		// enhance for
		for (TreeSetProduct i : ts) {
			System.out.println(i);
		}
		System.out.println("===================================");

		// for each stream API
		ts.stream().forEach(s -> System.out.println(s));
		System.out.println("===================================");
		
		
		//-------------------- object operation -------------------------- 
		// decrease the TreeSetProduct price by 10%
		for (TreeSetProduct e : ts) {
			e.setPprice(e.getPprice() * 0.90);
		}
		ts.stream().forEach(s -> System.out.println(s));
		System.out.println("===================================");

	}

}
