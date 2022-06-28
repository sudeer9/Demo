package com.BasentTechnologies;

import java.util.ArrayList;

public class D105_ArrayList2 
{
	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("java");
		al.add("Manual");
		al.add("java");//it allows duplicate values
		al.add("sudeer");
		
		
		
		
		//to get the element based on index
		System.out.println(al.get(1));
		//Modify the value in particular position
		al.set(1, "Selenium");
		System.out.println(al);
		
		//to add element/value in specific position
		al.add(2, "Testing");
		System.out.println(al);
		
		//remove element at specific position
		al.remove("java");
		System.out.println(al);
		
		al.remove(3);
		System.out.println(al);
		
		//It is used to search an element
	 boolean check = al.contains("Testing");
		System.out.println(check);
		
		//to remove all elements from the object
		al.removeAll(al);
		System.out.println(al);
		
		 boolean check1 = al.isEmpty();
		System.out.println(check1);
		

	}

}
