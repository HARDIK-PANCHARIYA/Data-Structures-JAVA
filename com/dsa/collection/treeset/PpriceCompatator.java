package com.dsa.collection.treeset;

import java.util.Comparator;

public class PpriceCompatator implements Comparator<TreeSetProduct> {

	@Override
	public int compare(TreeSetProduct o1, TreeSetProduct o2) {
		Double p1=o1.getPprice();
		Double p2=o2.getPprice();
		return p1.compareTo(p2);
}

}