package com.collectionDemo;

import java.util.HashMap;

public class HashmapDemo {
	public static void main(String[] args) {
		
		HashMap m=new HashMap();
		
		m.put(101, "Sushant");
		m.put(102, "asish");
		m.put(103, "akshay");
		m.put(104, "sanket");
		m.put(105, "vishal");
		m.put(106, "jhon");
		
		System.out.println(m);
		
		//get value
		System.out.println(m.get(105));
		
		//remove pair from hashmap
		m.remove(104);
		System.out.println(m);
		
		// check key present in hashmap
		System.out.println(m.containsKey(101));
		
		//check value present in hashmap
		System.out.println(m.containsValue("g"));
		
		//check hashmap is empty or not
		System.out.println(m.isEmpty());
		
		//return all keySet
		System.err.println(m.keySet());
		
		//return all values
		System.err.println(m.values());
		
		//return all key and value as set
		System.out.println(m.entrySet());
		
		//printb all key individual
		for(Object i:m.keySet()) {
			System.out.println(i);
		}
		
		//print all values individual
		for(Object i:m.values()) {
			System.out.println(i);
		}
		
		//print key and value individual
		for(Object i:m.keySet()) {
			System.out.println(i+" "+m.get(i));
		}
		
		//Entry interface mathod
		//********************
		
		
	}
	
	

}
