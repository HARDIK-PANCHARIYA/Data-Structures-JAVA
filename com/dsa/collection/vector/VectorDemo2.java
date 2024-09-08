package com.dsa.collection.vector;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo2 {
	
	public static void main(String[] args) {
		
		Vector v= new Vector<>();
		
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		
		//------------- size --------------
		System.out.println(v.size());
		System.out.println("=============================\n");
		
		// ------------ add vector in vector  -------------
		
		Vector v1= new Vector<>();
		v.add(00);
		v1.add(v);
		v.add(70);
		System.out.println(v1);
		System.out.println("=============================\n");
		
		
		//// ---------------- iterate one by one objects --------------------
		
		// Enumeration 
		Enumeration e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		System.out.println("====================================\n");
		
		
		// for
		for(int i=0; i<v.size(); i++) {
			System.out.println(v.get(i));
		}
		System.out.println("====================================\n");
		
		// for each stream API
		v.stream().forEach(s->System.out.println(s));
		System.out.println("====================================\n");
		
		// Iterator
		Iterator itr = v.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("====================================\n");
		
		// List Iterator for reverse order
		ListIterator litr = v.listIterator(v.size());
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
		System.out.println("====================================\n");
		
		//-------------- sort -----------------------
		
		Collections.sort(v);
		System.out.println(v);
				
		
	}

}
