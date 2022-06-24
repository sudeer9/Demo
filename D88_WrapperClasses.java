package com.BasentTechnologies;

public class D88_WrapperClasses 
{
	public static void main(String[] args) 
	{
		//boxing
		byte k=10;
		Byte b= new Byte(k);
		System.out.println(b);

		int a=20;
		Integer i=new Integer(a);
		System.out.println(i);
		
		//Unboxing
		Double d= new Double(10);
		int d1=d.intValue();
		System.out.println(d1);

		Integer i1=new Integer(10);
		int i2=i1.intValue();
		System.out.println(i2);
		
		//Auto boxing
		//int i3=5;
		Integer j1=5;//Auto boxing
		System.out.println(j1);

		//Auto-unboxing
		Integer i4=new Integer(10);
		int j2=i4;//Auto-unboxing
		System.out.println(j2);



	}

}
