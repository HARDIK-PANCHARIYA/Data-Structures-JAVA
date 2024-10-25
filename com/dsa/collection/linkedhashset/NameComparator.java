package com.dsa.collection.linkedhashset;

import java.util.Comparator;

public class NameComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getPname().compareTo(o2.getPname()); // Compare by name
    }
}
