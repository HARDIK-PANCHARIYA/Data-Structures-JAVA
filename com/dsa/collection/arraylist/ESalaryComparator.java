package com.dsa.collection.arraylist;

import java.util.Comparator;

public class ESalaryComparator implements Comparator<EmployeeArrayList> {


	@Override
	public int compare(EmployeeArrayList o1, EmployeeArrayList o2) {
		Double d1=o1.getEsalary();
		Double d2=o2.getEsalary();
		return d1.compareTo(d2);
	}

}
