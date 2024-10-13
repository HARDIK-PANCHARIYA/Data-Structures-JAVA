package com.dsa.collection.treeset;
import java.time.LocalDate;
import java.util.Comparator;

public class TreeSetProduct implements Comparable<TreeSetProduct>, Comparator<TreeSetProduct>{
	
	private int pid;
	private String pname;
	private double pprice;
	private LocalDate pexp;
	
	public TreeSetProduct(int pid, String pname, double pprice, int yyyy, int mm , int dd) {
		this.pid=pid;
		this.pname=pname;
		this.pprice=pprice;
		this.pexp=LocalDate.of(yyyy, mm, dd);
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

	public LocalDate getPexp() {
		return pexp;
	}

	public void setPexp(LocalDate pexp) {
		this.pexp = pexp;
	}

	@Override
	public String toString() {
		return "[pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + ", pexp=" + pexp + "]";
	}

//	@Override
//	public int compareTo(TreeSetProduct o) {
//		int a=this.getPid();
//		int b=o.getPid();
//		return Integer.compare(a, b);
//	}

	@Override
	public int compareTo(TreeSetProduct o) {
	        return Integer.compare(this.getPid(), o.getPid()); 
	}

@Override
public int compare(TreeSetProduct o1, TreeSetProduct o2) {
	// TODO Auto-generated method stub
	return 0;
}
	
	

}
