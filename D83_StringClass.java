package com.BasentTechnologies;

public class D83_StringClass 
{
	public static void main(String[] args) 
	{
		 String s1=new String("sudeer");
		 System.out.println(s1);
		 
		 String s2="Raju";
		 System.out.println(s2);
		 
		 //	String is immutable
		 String s3="sanjay";
		
		 //System.out.println(s3);
		  s3="Varma";
		 System.out.println(s3);
		 
		 System.out.println("========================");
		 String a="java";
		 String b="Java";//both a and b refers to java(string constant pool 
		 String c=new String("java");
		 String d= new String("java");//new keyword creats new object in heap memory
		 System.out.println(a==b);
		 System.out.println(c==d);
		 System.out.println(a==c);
		 System.out.println("========================");
		 System.out.println(a.equals(b));
		 System.out.println(c.equals(d));
		 System.out.println(a.equals(c));
		 
		 System.out.println("========================");
		 //
		StringBuffer s4=new StringBuffer("sudeer");
		System.out.println(s4);
		s4.append(" 123");
		System.out.println(s4);
		

	}

}
