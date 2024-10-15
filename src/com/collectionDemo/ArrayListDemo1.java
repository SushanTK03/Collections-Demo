package com.collectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListDemo1 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		
		al.add("X");
		al.add("Y");
		al.add("Z");
		al.add("A");
		al.add("B");
		al.add("C");
		
		ArrayList ar=new ArrayList();
	
	// Add elements into array	
		ar.addAll(al);
		
		System.out.println(ar);
	
	// Remove elements into array	
		
	    ar.removeAll(al);
		
		System.out.println(ar);
		
	// Sorting element assending
		
		Collections.sort(al);
		
		System.out.println(al);
		
   //  Sorting element deccending	
		Collections.sort(al,Collections.reverseOrder());
		 System.out.println(al);
  
   //  shuffle the element
		 
		 Collections.shuffle(al); 
		 System.out.println(al);
		
		
	}

}
 