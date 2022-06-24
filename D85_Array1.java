package com.BasentTechnologies;

public class D85_Array1 
{
	public static void main(String[] args) 
	{
		//int array
		int[] a= new int[5];
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		//a[5]=50;//java.lang.ArrayIndexOutOfBoundsException
		System.out.println(a[3]);
		
		System.out.println("==========================");
		
		for(int i=0; i<a.length; i++)// replace 5 with "a.length" both gives same meaning
		{
			System.out.println(a[i]);
		}
		System.out.println("=============================");
		
		//String array
		String[] s= new String[3];
		s[0]="java";
		s[1]="manual";
		s[2]="selenium";
		
		//we can use "for-each" also instead of for loop.it is used to iterate
		//elements in arrays or collection. its also called as advanced for
		
		for(String j:s)
		{
			System.out.println(j);
		}
		
	}
}
