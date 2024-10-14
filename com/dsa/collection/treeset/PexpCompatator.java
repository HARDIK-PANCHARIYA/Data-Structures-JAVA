package com.dsa.collection.treeset;

import java.time.LocalDate;
import java.util.Comparator;

public class PexpCompatator implements Comparator<TreeSetProduct> {

	@Override
	public int compare(TreeSetProduct o1, TreeSetProduct o2) {
	  LocalDate d1=o1.getPexp();
	  LocalDate d2=o2.getPexp();
	  return d1.compareTo(d2);
	}

}
