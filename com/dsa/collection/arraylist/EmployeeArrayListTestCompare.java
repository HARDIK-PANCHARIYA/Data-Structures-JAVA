package com.dsa.collection.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import com.collection.arraylist.employee.comparator.EmployeeNameComparator;
import com.collection.arraylist.employee.comparator.EmployeeSalaryComparator;

public class EmployeeArrayListTestCompare {
	
	public static void main(String[] args) {
		
	
	EmployeeArrayList e1=new EmployeeArrayList(101,"Hardik",805000,"Java Developer");
	EmployeeArrayList e2=new EmployeeArrayList(302,"Soham",656800,"SQL Developer");
	EmployeeArrayList e3=new EmployeeArrayList(202,"Vedant",570000,"Web Designing");
	EmployeeArrayList e4=new EmployeeArrayList(404,"Prajwal",750000,"React Designing");
	EmployeeArrayList e5=new EmployeeArrayList(121,"Sanket",406052,"Developer");
	
	// create ArrayList for EmployeeArrayList
	ArrayList<EmployeeArrayList> al = new ArrayList<>();
	al.add(e1);
	al.add(e2);
	al.add(e3);
	al.add(e4);
	al.add(e5);
	
	// stream API
	al.stream().forEach(s->System.out.println(s));
	System.out.println("=========================");
	
	
	// compare by id --- Comparable
	Collections.sort(al);
	al.stream().forEach(s->System.out.println(s));
	System.out.println("=========================");
	
	
	//sorting base on Name ---- Comparator
	Collections.sort(al, new ENameComparator());
	al.stream().forEach(s->System.out.println(s));
	System.out.println("=========================");
	
	
	//sorting base on Salary ---- Comparator
	Collections.sort(al, new ESalaryComparator());
	al.stream().forEach(s->System.out.println(s));
	
	
	
	
}
}
