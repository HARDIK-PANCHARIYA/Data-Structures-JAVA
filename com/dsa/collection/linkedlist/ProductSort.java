package com.dsa.collection.linkedlist;

import java.time.LocalDate;
import java.util.Comparator;

public class ProductSort implements Comparable<ProductSort>,Comparator<ProductSort> {
	
	int pid;
	String pname;
	double pprice;
	LocalDate pexp;
	
	ProductSort(int pid, String pname, double pprice, int yyyy, int mm,int dd ){
		this.pid=pid;
		this.pname=pname;
		this.pprice=pprice;
		this.pexp=LocalDate.of(yyyy,mm,dd);
	}
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid=pid;
	}
	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname=pname;
	}
	
	public double getPprice() {
		return pprice;
	}
	public void setPprice(double pprice) {
		this.pprice=pprice;
	}
	
	public LocalDate getPexp() {
		return pexp;
	}
	public void setPexp(LocalDate pexp) {
		this.pexp=pexp;
	}
	
	@Override
	public String toString() {
		return "[pid="+pid+", pname="+pname+", pprice=" + pprice + ", pexp=" + pexp + "]";
	}

	@Override
	//compare by id --- Comparable
	public int compareTo(ProductSort o) {
		int a=this.getPid();
		int b=o.getPid();
		return Integer.compare(a, b);
	}

	@Override
	//Comparator
	public int compare(ProductSort o1, ProductSort o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	

}
