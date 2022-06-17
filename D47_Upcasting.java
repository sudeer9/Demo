package com.BasentTechnologies;

 class Up1
{
	void test1()
	{
		System.out.println("test1 in class Up1");
	}
}
class Up2 extends Up1
{
	void test2()
	{
		System.out.println("test2 in class Up2");
	}
}

public class D47_Upcasting 
{
	public static void main(String[] args) 
	{
		
		Up1 u= (Up1) new Up2();
		//or
		Up1 u1=new Up2();
		u1.test1();
		
	
		
	
		
		
		

	}

}
