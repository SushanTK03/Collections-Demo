package com.collectionDemo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {
		
		//;//default capacity 16 load factor 0.75
		
		//HashSet hs=new HashSet( 100,(float)0.95) //  capacity 100 and load factor 0.95
		
		HashSet hs=new HashSet();
		
		hs.add("welcome");
		hs.add(100);
		hs.add('A');
		hs.add("amit");
		hs.add(1.5);
		
		System.out.println(hs);
	//after removing element	
		hs.remove(1.5);
		
		System.out.println(hs);
		
	//	contains
		
		System.out.println(hs.contains("welcome"));
	
	
	//reading element from hashset using for:each.. loop
	
		for(Object e:hs) {
			System.out.println(e);
		}
		
		Iterator it=hs.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}

		
	}

}
