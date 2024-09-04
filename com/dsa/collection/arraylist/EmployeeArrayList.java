package com.dsa.collection.arraylist;

public class EmployeeArrayList {
	
	private int eid;
	private String ename;
	private double esalary;
	private String edesignation;
	
	public EmployeeArrayList(int eid, String ename, double esalary, String edesignation) {
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
	
	

}
