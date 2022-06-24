package com.BasentTechnologies;

public class D84_StringMethods 
{	
	public static void main(String[] args) 
	{
		String s1="Java";
		
		System.out.println(s1.charAt(2));//returns character at the given index
		
		System.out.println(s1.length());//returns lenght of the given string
		
		//
		String s2="selenium";
		//System.out.println(s2);
		for(int i=0; i<s2.length(); i++) 
		{
			System.out.print(s2.charAt(i));
		}
		System.out.println();
		
		//equals and equalsIgnoreCase
		String s3= new String("java");
		String s4="jAvA";
		System.out.println(s3.equals(s4));
		System.out.println(s3.equalsIgnoreCase(s4));
		
		String s5="Technologies";
		System.out.println(s5.substring(5));//from 5th index it will extract
		System.out.println(s5.substring(2, 8));//it will extract from 2 position till 8th position but it won't show last character
		
		String s6="Manual";
		//replace character
		System.out.println(s6.replace('a', 'A'));
		//replace string
		System.out.println(s6.replace("Man","ABC" ));
		
		//indexOf: returns the index of the 1st occurance of the given 
		//character if it exists otherwise it returns -1
		String s7="TeseTinereg";
		System.out.println(s7.indexOf('e'));
		System.out.println(s7.indexOf('e', 2));// it will search for "t" from index 2
		
		//trim() method removes spaces present either at begining or end
		//it will not remove spaces b/w words or characters
		String s8="         ja      va                ";
		System.out.println(s8.trim());
		
		String s9="selenium";
		System.out.println(s9.toUpperCase());
		
		String s10="AUTOMATION";
		System.out.println(s10.toLowerCase());
	}

}
