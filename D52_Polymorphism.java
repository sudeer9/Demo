package com.BasentTechnologies;
class A111
{
	void test1()
	{
		System.out.println("test1 in class A111");
	}
}

class B111 extends A111
{
	void test2()
	{
		System.out.println("test2 in class B111");
	}
}

class C111 extends B111
{
	void test3()
	{
		System.out.println("test3 in class C111");
	}
}

public class D52_Polymorphism 
{
	public static void main(String[] args) 
	{
		C111 c1=new C111();
		c1.test1();
		c1.test2();
		c1.test3();
		System.out.println("===================================");
		B111 b1=c1;
		b1.test1();
		b1.test2();
		System.out.println("===================================");
		A111 a1=c1;
		a1.test1();	
	}
}


