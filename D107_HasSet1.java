package com.BasentTechnologies;

import java.util.HashSet;
import java.util.Iterator;

public class D107_HasSet1 
{
	public static void main(String[] args) 
	{
		HashSet<String> hs=new HashSet<String>();
		hs.add("sudeer");
		hs.add("selenium");
		hs.add("java");
		hs.add("sudeer");
		hs.add("Besant");
		
		System.out.println(hs);
		HashSet<String> hs1=new HashSet<String>();
		hs1.add("sudeer");
		hs1.add("Besant");
		hs1.add("java");
		hs1.add("sudeer");
		hs1.add("8pm");
		System.out.println(hs1);
		
		
		
		boolean equals = hs.equals(hs1);
		System.out.println(equals);
		
		boolean result = hs.contains("java");
		System.out.println(result);
		
		boolean all = hs.containsAll(hs1);
		System.out.println(all);
		
		hs.addAll(hs1);
		System.out.println(hs);
	
		
	}

}
