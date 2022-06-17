package com.BasentTechnologies;

interface I2
{
	void test1();
}
interface I3 
{
	void test2();
}

interface I4 extends I2,I3
{
	void test3();
}

class CA1 implements I2,I3
{

	public void test1() 
	{
		System.out.println("test1 from interface I2");
		
	}

	public void test2() 
	{
		System.out.println("test2 from interface I3");
		
	}
	
}

public class D54_Interface2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CA1 ca1=new CA1();
		ca1.test2();
		ca1.test1();

	}

}
