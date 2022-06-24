package com.BasentTechnologies;

import java.util.Arrays;

public class D87_Array2 {
	public static void main(String[] args) {
	
		//Printing array elements in reverse order
		
		int a[]={7,9,2,3,4,5,8,1,6};
		System.out.println(a[1]);
		
		for(int i=a.length-1; i>=0; i--)
		{
			System.out.print(a[i]+",");
		}
		 System.out.println("");
		 Arrays.sort(a);
		 
		 for(int d:a) 
		 {
		 System.out.print(d+",");
		 
		 }
		 System.out.println("");
		 System.out.println("=====================================");
		
		for(int i=a.length-1; i>=0; i--)
		{
			System.out.print(a[i]+",");
		}
		System.out.println("");
		System.out.println("===================");
		//Reversing character array
		char[] c= {'e','b','c','d','a'};
		for(int i=c.length-1; i>=0; i--)
		{
			System.out.println(c[i]);
		}
		
		
		System.out.println("===================");
		//Revrsing the given string
		
		String s1="selenium";
		  char[] c1 = s1.toCharArray();
		for( int i=c1.length-1; i>=0; i--)
		{
			System.out.print(c1[i]);
		}

	}

}
