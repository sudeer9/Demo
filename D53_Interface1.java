package com.BasentTechnologies;

interface Java
{
	 void test1();
	 void test2();	
}

interface Selenium
{
	 void test3();
	 void test4();	
}

interface Java_Selenium extends Selenium,Java
{
	 void test5();
	 void test6();	
}

class Execute implements Java_Selenium
{
	public void test1()
	{
		System.out.println("test1");
	}
	public void test2()
	{
		System.out.println("test2");
	}
	
	public void test3()
	{
		System.out.println("test1");
	}
	public void test4()
	{
		System.out.println("test2");
	}
	
	public void test5()
	{
		System.out.println("test1");
	}
	public void test6()
	{
		System.out.println("test2");
	}
}
public class D53_Interface1
{
	public static void main(String[] args)
	{
		Execute e= new Execute();
		e.test3();
	}
}