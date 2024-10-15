package com.collectionDemo;

import java.util.Hashtable;

public class HashtableDemo {
	public static void main(String[] args) {
		Hashtable ht=new Hashtable();
		
		ht.put(201, "cat");
		ht.put(202, "dog");
		ht.put(203, "ox");
		ht.put(204, "mouce");
		ht.put(205, "donckey");
		ht.put(206, "elephant");
		
		System.out.println(ht);
		
		//get value using key
		System.out.println(ht.get(201));
		
		//remove pair from hashtable
		ht.remove(201);
		System.out.println(ht);
		
		//check value present in hashtable
		System.out.println(ht.contains("dog"));
		
		//check key present in hashtable
		System.out.println(ht.containsKey(202));
		
		//return all keyset
		System.out.println(ht.keySet());
		
		//return all value set
		System.out.println(ht.values());
		
		//return all values and key as set
		System.out.println(ht.entrySet());
		
		//print all key individual
		for(Object i:ht.keySet()) {
			System.out.println(i);
		}
		
		//print all values individual
		for(Object i:ht.values()) {
			System.out.println(i);
		}
		
		//print key an dvalues individualy
		for(Object i:ht.keySet()) {
			System.out.println(i+" "+ht.get(i));
		}
		
		
	}

}
