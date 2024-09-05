package com.dsa.collection.arraylist;

import java.util.Comparator;

public class ENameComparator implements Comparator<EmployeeArrayList> {

	@Override
	public int compare(EmployeeArrayList o1, EmployeeArrayList o2) {
		String s1 =o1.getEname();
		String s2= o2.getEname();
		return s1.compareTo(s2);
	}
	
	
}
