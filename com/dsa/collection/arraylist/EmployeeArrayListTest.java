package com.dsa.collection.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.collection.arraylist.employee.salarayincrease.Employee;

public class EmployeeArrayListTest {
	
	public static void main(String[] args) {
		
		EmployeeArrayList e1=new EmployeeArrayList(101,"Hardik",305000,"Java Developer");
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
		
		System.out.println(al);
		System.out.println("=========================");
		
		
		// iterate object one by one
		// using Iterator
		Iterator<EmployeeArrayList> itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("=========================");
		
		
		
		// increase the salary by 10%
		for(EmployeeArrayList e : al) {
			e.setEsalary(e.getEsalary()*1.10);	
		}
		// iterate the object one by one 
		// using for loop
		for(EmployeeArrayList e : al) {
			System.out.println(e);
		}
		System.out.println("=========================");
		
		
		
	}

}
