package com.dsa.collection.HashMap;

import java.util.HashMap;

public class HashMapDemo {
	
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
		
		// key should be unique 
		//or the latest Value get update to the key
		hm.put(10, "Hardik");
		
		System.out.println(hm);
		System.out.println("========================================\n");
		
		// Follow Random Order Sorting
		System.out.println("=================================\n");
		
		// size of HashMap
		int l = hm.size();
		System.out.println(l);
		System.out.println("=================================\n");
		
		// get Value by key from HashMap
		String s = hm.get(10);
		System.out.println(s);
		System.out.println("=================================\n");
		
		// Check Key present in HashMap
		Boolean keyresult = hm.containsKey(10);
		System.out.println(keyresult);
		System.out.println("=================================\n");
		
		// Check Value present in HashMap
		Boolean valueresult = hm.containsValue("Hiii");
		System.out.println(valueresult);
		System.out.println("=================================\n");
		
		
		
	}

}
