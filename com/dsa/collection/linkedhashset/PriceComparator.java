package com.dsa.collection.linkedhashset;

import java.util.Comparator;

public class PriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return Double.compare(o1.getPprice(), o2.getPprice()); // Compare by price
    }
}

