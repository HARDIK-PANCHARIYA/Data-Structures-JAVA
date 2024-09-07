package com.dsa.collection.linkedlist;

import java.util.Comparator;

public class PpriceCompatator implements Comparator<ProductSort>{

	@Override
	public int compare(ProductSort o1, ProductSort o2) {
		double s1=o1.getPprice();
		double s2=o2.getPprice();
		return Double.compare(s1,s2);
	}

}
