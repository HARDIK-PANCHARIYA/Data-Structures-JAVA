package com.dsa.collection.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapIterator {
	
	public static void main(String[] args) {
		
HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		// ================ HashMap ===============
		
		// Add element in map
		// in form of Key and Value form (Key,Value)
		hm.put(10, "abc");
		hm.put(20, "xyz");
		hm.put(30, "Hardik");
		hm.put(40, "pqr");
		hm.put(null, "Ram");
		
		// not proper way to get HashMap Result
		System.out.println(hm);
		System.out.println("==============================\n");
		
		// by using entry set 
		// old way to get key and value
		Set s = hm.entrySet();
		Iterator itr = s.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("==============================\n");
		
		// Another way
		// Using For-Each
		for(Map.Entry i : hm.entrySet()) {
			System.out.println(i.getKey()+":"+i.getValue());
		}
		System.out.println("==============================\n");
		
		// iterate by key to get value
		for(Integer key : hm.keySet()) {
			String value = hm.get(key);
			System.out.println(key+":"+value);
		}
		System.out.println("==============================\n");
		
		// For-Each
		hm.forEach((key,value)->{System.out.println(key+":"+value);});
		System.out.println("==============================\n");
		
		// combination of entryset and for each 
		// stream API
		hm.entrySet().stream()
		.forEach(entry->{System.out
			.println(entry.getKey()+":"+entry.getValue());});
		
		
	}

}
