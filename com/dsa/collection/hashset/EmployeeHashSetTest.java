package com.dsa.collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

import com.dsa.collection.arraylist.EmployeeArrayList;

public class EmployeeHashSetTest {
	
	public static void main(String[] args) {
		
		EmployeeHashSet e1=new EmployeeHashSet(101,"Hardik",305000,"Java Developer");
		EmployeeHashSet e2=new EmployeeHashSet(302,"Soham",656800,"SQL Developer");
		EmployeeHashSet e3=new EmployeeHashSet(202,"Vedant",570000,"Web Designing");
		EmployeeHashSet e4=new EmployeeHashSet(404,"Prajwal",750000,"React Designing");
		EmployeeHashSet e5=new EmployeeHashSet(121,"Sanket",406052,"Developer");
		
		//--------------------- Create HashSet -----------------------
		HashSet<EmployeeHashSet> hs = new HashSet<EmployeeHashSet>();
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		hs.add(e5);
		
		System.out.println(hs);
		System.out.println("=========================");
		
		
		// iterate object one by one
		// using Iterator
		Iterator<EmployeeHashSet> itr=hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("=========================");
		
		// increase the salary by 10%
		for(EmployeeHashSet e : hs) {
			e.setEsalary(e.getEsalary()*1.10);	
		}				
				
		// iterate the object one by one 
		// using enhance for loop
		for(EmployeeHashSet e : hs) {
			System.out.println(e);
		}
		System.out.println("=========================");
					
	}

}
