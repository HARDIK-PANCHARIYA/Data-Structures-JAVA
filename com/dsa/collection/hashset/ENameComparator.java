package com.dsa.collection.hashset;

import java.util.Comparator;

import com.dsa.collection.arraylist.EmployeeArrayList;


/// --------------------- not allowed -------------------
//public class EidComparator implements Comparator<EmployeeHashSet>{
//
//}

// convert set to list and use this  
public class ENameComparator implements Comparator<EmployeeHashSet> {

	@Override
	public int compare(EmployeeHashSet o1, EmployeeHashSet o2) {
		String s1 =o1.getEname();
		String s2= o2.getEname();
		return s1.compareTo(s2);
	}
	
	
}
