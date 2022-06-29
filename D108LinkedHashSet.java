package com.BasentTechnologies;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class D108LinkedHashSet 
{

	public static void main(String[] args) 
	{
		LinkedHashSet hs=new LinkedHashSet();
		hs.add("sudeer");
		hs.add("selenium");
		hs.add("java");
		hs.add("sudeer");
		hs.add(1);
		hs.add(5);
		System.out.println(hs);
		
		LinkedHashSet<Integer> hs5=new LinkedHashSet<Integer>();
		hs5.add(1);
		hs5.add(5);//It can receive any type of objects. i.e here hs is String 
		///and hs5 is Integer which is not same		
		boolean xyz = hs.containsAll(hs5);
		System.out.println(xyz);
		
		
		LinkedHashSet<String> hs1=new LinkedHashSet<String>();
		hs1.add("sudeer");
		hs1.add("selenium1");
		hs1.add("java");
		hs1.add("sudeer");
		
		
		boolean equals = hs.equals(hs1);
		System.out.println(equals);
		
		boolean all = hs.containsAll(hs1);
		System.out.println(all);
		
		hs.addAll(hs1);
	
		System.out.println(hs);
		
		

	}

}
