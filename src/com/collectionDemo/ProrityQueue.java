package com.collectionDemo;

import java.util.PriorityQueue;

public class ProrityQueue {
	public static void main(String[] args) {
		PriorityQueue p=new PriorityQueue();
		
		//Add element
		p.add("A");
		p.add("B");
		p.add("C");
		
		p.offer("C");
		
		System.out.println(p);
		
		//Get hed element
		
		System.out.println(p.element());
		
		System.out.println(p.peek());
		
		//retain and remove element from Queue
		
		System.out.println(p.remove());
		
		System.out.println(p);
		
		System.out.println(p.poll());
		
		System.out.println(p);
	}

}
