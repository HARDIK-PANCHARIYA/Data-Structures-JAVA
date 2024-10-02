package com.dsa.collection.hashset;

import java.util.Comparator;

public class EmployeeHashSet implements Comparable<EmployeeHashSet>, Comparator<EmployeeHashSet> {
	
	private int eid;
	private String ename;
	private double esalary;
	private String edesignation;
	
	public EmployeeHashSet(int eid, String ename, double esalary, String edesignation) {
		this.eid=eid;
		this.ename=ename;
		this.esalary=esalary;
		this.edesignation=edesignation;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getEsalary() {
		return esalary;
	}

	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}

	public String getEdesignation() {
		return edesignation;
	}

	public void setEdesignation(String edesignation) {
		this.edesignation = edesignation;
	}

	@Override
	public String toString() {
		return "[eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + ", edesignation="
				+ edesignation + "]";
	}

	

//	-------------------- not allowed -------------------------
	// Comparator
//	@Override
//	public int compare(EmployeeHashSet o1, EmployeeHashSet o2) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

	
//	----------------------- not valid for set ------------------
	// Comparable
//	@Override
//	public int compareTo(EmployeeHashSet o) {
//		Integer a=this.getEid();
//		Integer b=o.getEid();
//		return a.compareTo(b);
//	}
	
	// --- to use above methods convert to arraylist and then apply 
//	comparable and Comparator
	@Override
	public int compareTo(EmployeeHashSet o) {
		Integer a=this.getEid();
		Integer b=o.getEid();
		return a.compareTo(b);
	}

	@Override
	public int compare(EmployeeHashSet o1, EmployeeHashSet o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
