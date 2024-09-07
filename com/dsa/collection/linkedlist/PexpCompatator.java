package com.dsa.collection.linkedlist;

import java.time.LocalDate;
import java.util.Comparator;

public class PexpCompatator implements Comparator<ProductSort>{

	@Override
	public int compare(ProductSort o1, ProductSort o2) {
		LocalDate s1=o1.getPexp();
		LocalDate s2=o2.getPexp();
		return s1.compareTo(s2);
	}

}
