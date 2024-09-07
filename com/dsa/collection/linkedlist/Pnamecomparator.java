package com.dsa.collection.linkedlist;

import java.util.Comparator;

public class Pnamecomparator implements Comparator<ProductSort> {

	@Override
	public int compare(ProductSort o1, ProductSort o2) {
		String s1=o1.getPname();
		String s2=o2.getPname();
		return s1.compareTo(s2);
	}

}
