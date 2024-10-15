package com.collectionDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
public static void main(String[] args) {
	LinkedHashSet<Integer> lh=new LinkedHashSet<Integer>();
	LinkedHashSet lhs=new LinkedHashSet();
	
	lhs.add(100);
	lhs.add(200);
	lhs.add(300);
	lhs.add(400);
	lhs.add(500);
	
	System.out.println(lhs);
	
	HashSet<Integer> hs=new HashSet<Integer>();
	
	hs.add(100);
	hs.add(200);
	hs.add(300);
	hs.add(400);
	hs.add(500);
	
	System.out.println(hs);
}
}
