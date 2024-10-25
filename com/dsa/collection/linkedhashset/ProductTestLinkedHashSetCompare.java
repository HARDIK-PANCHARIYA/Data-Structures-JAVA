package com.dsa.collection.linkedhashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class ProductTestLinkedHashSetCompare {

	public static void main(String[] args) {

		LinkedHashSet<Product> lh = new LinkedHashSet<Product>();

		lh.add(new Product(201, "NoteBook", 200, 10, "Stationary"));
		lh.add(new Product(101, "Laptop", 60000, 21, "Electronic"));
		lh.add(new Product(202, "Pen", 10, 100, "Stationary"));
		lh.add(new Product(102, "Mouse", 600, 40, "Electronic"));
		lh.add(new Product(203, "Table", 350, 5, "Stationary"));

		System.out.println(lh);
		System.out.println("====================================");

		// stream API
		lh.stream().forEach(s -> System.out.println(s));
		System.out.println("=========================");

		// ----------------- not valid for set -----------------
		// compare by id ---- comparable
		// Collections.sort(lh);
		// lh.stream().forEach(s->System.out.println(s));
		// System.out.println("====================================");

		// to compare objects and sort we first convert linkedhashset to arraylist and
		// then
		// sort as per the requirement

		List<Product> plist = new ArrayList<Product>(lh);

		// sort base on ---- pid ---- Comparable
		Collections.sort(plist);
		plist.stream().forEach(s -> System.out.println(s));
		System.out.println("=================================");

		// sort base on ---- Price --- comparator
		plist.sort(new PriceComparator());
		System.out.println("Sorted by Price:");
		for (Product p : plist) {
			System.out.println(p);
		}
		System.out.println("=================================");

		// sort base on ---- Name --- comparator
		plist.sort(new NameComparator());
		System.out.println("Sorted by Name:");
		for (Product p : plist) {
			System.out.println(p);
		}
		System.out.println("=================================");

		// sort base on ---- Quantity --- comparator
		Collections.sort(plist, new QuantityComparator());
		System.out.println("Sorted by Quantity:");
		for (Product p : plist) {
			System.out.println(p);
		}
		System.out.println("=================================");

	}

}
