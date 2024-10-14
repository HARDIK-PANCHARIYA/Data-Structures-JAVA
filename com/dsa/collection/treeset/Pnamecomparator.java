package com.dsa.collection.treeset;

import java.util.Comparator;

public class Pnamecomparator implements Comparator<TreeSetProduct> {

	@Override
	public int compare(TreeSetProduct o1, TreeSetProduct o2) {
		String s1=o1.getPname();
		String s2=o2.getPname();
		return s1.compareTo(s2);
	}

}
