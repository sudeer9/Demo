package com.BasentTechnologies;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class D109_TreeSet {
	public static void main(String[] args) 
	{
		TreeSet<Integer> hs=new TreeSet<Integer>();
		hs.add(4);
		hs.add(1);
		hs.add(3);
		hs.add(2);
		System.out.println(hs);
		
		TreeSet<String> hs6=new TreeSet<String>();
		hs6.add("d");
		hs6.add("a");
		hs6.add("c");
		hs6.add("b");
		
		//hs.containsAll(hs6);// it can't take diffrent types
		System.out.println(hs6);
		//It can receive only unique objects. i.e here hs is Integer 
		//and hs6 is string which is not same
		
		
		
		TreeSet<Integer> hs1=new TreeSet<Integer>();
		hs1.add(4);
		hs1.add(1);
		hs1.add(10);
		hs1.add(2);
		
		hs.retainAll(hs1);//it will keep the common elements
		System.out.println(hs);
		
		boolean equals = hs.equals(hs1);
		System.out.println(equals);
		
		boolean all = hs.containsAll(hs1);
		System.out.println(all);
		
		hs.addAll(hs1);
		System.out.println(hs);
		
		

	}

}
