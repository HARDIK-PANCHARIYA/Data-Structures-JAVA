package com.dsa.collection.hashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import com.dsa.collection.arraylist.ENameComparator;

public class EmployeeHashSetcomaremethods {
	
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
		
		
		// stream API
		hs.stream().forEach(s->System.out.println(s));
		System.out.println("=========================");
		
		
		// ----------------- not valid for set -----------------
		// compare by id --- Comparable
		//Collections.sort(hs);
		//hs.stream().forEach(s->System.out.println(s));
		//System.out.println("=========================");
		
		// to compare objects and sort  we first convert hashset to arraylist and then
		// sort as per the requirement
		
		List<EmployeeHashSet> employeeList = new ArrayList<>(hs);
		
		Collections.sort(employeeList);
		employeeList.stream().forEach(s->System.out.println(s));
		System.out.println("=========================");
		

		
		
		
	}

}
