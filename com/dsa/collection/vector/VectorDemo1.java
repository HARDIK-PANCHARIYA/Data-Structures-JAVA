package com.dsa.collection.vector;

import java.util.Vector;

public class VectorDemo1 {
	
	public static void main(String[] args) {
	
	Vector v= new Vector<>();
	
	// ---------------------- add -------------
	
	// add element in vector ---- add()
	v.add(10);
	v.add(20);
	v.add(30);
	v.add(40);
	v.add("Hardik");
	
	// add element in vector ---- addElement()
	v.addElement(50);
	v.addElement(60);
	
	
	// add element in vector at particular index ---- add(index,object) 
	v.add(1, 90);
	
	
	
	// ------------------------ get -----------------------
	
	// get element form vector --- get(index)
	System.out.println(v.get(0));
	System.out.println(v.get(2));
	System.out.println(v.get(6));
	System.out.println("============================\n");
	
	// get last element of vector ---- lastElement()
	System.out.println(v.lastElement());
	System.out.println("============================\n");
	
	// get first element of vector ----- firstElement()
	System.out.println(v.firstElement());
	System.out.println("============================\n");
	
	System.out.println(v);
	System.out.println("============================\n");
	
	// ------------- remove ---------------------------
	
	//remove by index ---- remove(index)
	v.remove(1);
	System.out.println(v);
	System.out.println("============================\n");
	
	//remove by index ---- removeElementAt(index)
	v.removeElementAt(0);
	System.out.println(v);
	System.out.println("============================\n");
	
	// remove all ---removeAllElements();
	v.removeAllElements();
	System.out.println(v);
	System.out.println("============================\n");
	
	// ------------- other methods ------------------
	
	// size of vector ------ size()
	System.out.println(v.size());
	System.out.println("============================\n");
	
	// index of element -------------- indexOf(object)
	System.out.println(v.indexOf(20));
	System.out.println("============================\n");
	
	// element present in vector ------- contains(object)
	System.out.println(v.contains(60));
	System.out.println("============================\n");
	
	//Original capacity of vector ------ capacity()
	System.out.println(v.capacity());
	System.out.println("============================\n");
	

}
}
