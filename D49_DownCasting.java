package com.BasentTechnologies;

//Downcasting is used only to down cast the upcated objects

class C
{
	void test1()
	{
		System.out.println("test1 in class C");
	}
}

class D extends C
{
	void test2()
	{
		System.out.println("test2 in class D");
	}
}

public class D49_DownCasting {
	public static void main(String[] args) 
	{
		
		//D d1= (D) new C();//runtime exception, not compile time error
		C c1= new D();//Upcasted D type to C Type
		D d2=(D)c1;//Down casting C to D type bcoz Downcasting is used only to down cast the upcated objects
		d2.test1();
		d2.test2();
		
	}

}
