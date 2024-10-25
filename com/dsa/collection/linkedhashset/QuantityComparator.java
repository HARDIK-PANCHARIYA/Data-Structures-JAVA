package com.dsa.collection.linkedhashset;

import java.util.Comparator;

public class QuantityComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return Integer.compare(o1.getPqty(), o2.getPqty()); // Compare by quantity
    }
}

