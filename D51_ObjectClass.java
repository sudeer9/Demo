package com.BasentTechnologies;

class AA extends Object
{
	void test1()
	{
		System.out.println("test1 in class AA");
	}
}
class BB extends Object
{
	void test2()
	{
		System.out.println("test1 in class BB");
	}
}
class CC extends Object
{
	void test3()
	{
		System.out.println("test1 in class CC");
	}
}

public class D51_ObjectClass {

	public static void main(String[] args) 
	{
		
		CC c31=new CC();
		
		
		//If u create instance of class CC, you can access methods in class CC
		Object c3=new CC();//Since upcasting is implicit, we can assign an instance of any type into a 
						  //reference variable of type Object.Now you can access the methods available in Object class
		System.out.println(c31);
		System.out.println(c3);
		System.out.println(c31.equals(c3));
		
		
		
		

	}

}
