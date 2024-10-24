package com.dsa.collection.linkedhashset;

import java.util.Comparator;

public class Product implements Comparable<Product>, Comparator<Product> {

	int pid;
	String pname;
	double pprice;
	int pqty;
	String pcategory;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int pid, String pname, double pprice, int pqty, String pcategory) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pprice = pprice;
		this.pqty = pqty;
		this.pcategory = pcategory;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getPprice() {
		return pprice;
	}

	public void setPprice(double pprice) {
		this.pprice = pprice;
	}

	public int getPqty() {
		return pqty;
	}

	public void setPqty(int pqty) {
		this.pqty = pqty;
	}

	public String getPcategory() {
		return pcategory;
	}

	public void setPcategory(String pcategory) {
		this.pcategory = pcategory;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + ", pqty=" + pqty + ", pcategory="
				+ pcategory + "]";
	}

//	----------------------- not valid for set ------------------
	// Comparable
//	@Override
//	public int compareTo(Product o) {
//		Integer a=this.getPid();
//		Integer b=o.getPid();
//		return a.compareTo(b);
//	}

	@Override
	public int compareTo(Product o) {
		Integer a = this.getPid();
		Integer b = o.getPid();
		return a.compareTo(b);
	}

	// Comparator (Custom Ordering by price)
    @Override
    public int compare(Product o1, Product o2) {
        return Double.compare(o1.pprice, o2.pprice); // Compare based on Product Price
    }

}
