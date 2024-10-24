package com.dsa.collection.linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

import com.dsa.collection.hashset.EmployeeHashSet;

public class ProductTestLinkedHashSet {
	
	public static void main(String[] args) {
		
		
		LinkedHashSet<Product> lh = new LinkedHashSet<Product>();
		
		lh.add(new Product(201,"NoteBook",200,10,"Stationary"));
		lh.add(new Product(101,"Laptop",60000,21,"Electronic"));
		lh.add(new Product(202,"Pen",10,100,"Stationary"));
		lh.add(new Product(102,"Mouse",600,40,"Electronic"));
		lh.add(new Product(203,"Table",350,5,"Stationary"));
		
		
		System.out.println(lh);
		System.out.println("====================================");
		
		// iterate object one by one
		// using Iterator
		Iterator<Product> itr=lh.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("=========================");
		
		// increase the Product price by 10%
		for(Product p : lh) {
			p.setPprice(p.getPprice()*1.10);	
		}
		
		// iterate the object one by one 
		// using enhance for loop
		for(Product p : lh) {
			System.out.println(p);
		}
		System.out.println("=========================");
							
		
	}

}
