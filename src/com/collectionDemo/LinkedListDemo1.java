package com.collectionDemo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {
	public static void main(String[] args) {
		
		LinkedList lt=new LinkedList();
		
		lt.add(10);
		lt.add(100);
		lt.add("Amit");
		lt.add('A');
		lt.add(null);
		
		System.out.println(lt);
		
		System.out.println(lt.size());
		
		//Remove
		lt.remove(0);
		System.out.println(lt);
		
		//Insert--adding element at midle of linkedlist
		
		lt.add(3, "sushant");
		
		System.out.println(lt);
		
		//retriving the value from linkedlist
		
	    System.out.println(	lt.get(0));
	    
	    //change the value
	    
	    lt.set(0, 1000);
	    System.out.println(lt);
	    
	    //contains
	    
	    System.out.println(lt.contains("java"));
	
	
	    for(int i=0;i<lt.size();i++) {
		System.out.println(lt.get(i));
	    }
	
	    for(Object e:lt) {
		System.out.println(e);
	    }
	   Iterator it=lt.iterator();
	
	   while (it.hasNext()) {
		System.out.println(it.next());
		
		
		
		
	}
	}
	
	
}
