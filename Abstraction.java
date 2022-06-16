package p1;

abstract class A1
{
	void test1()
	{
		System.out.println("test1 method");
	}
	
	abstract void test2();
	abstract void test3();
	abstract void test4();
}

 class B1 extends A1
{
	void test2()
	{
		System.out.println("implemented inherited method");
	}
	
	void test3()
	{
		System.out.println("implemented inherited method");
	}
	
	void test4()
	{
		System.out.println("implemented inherited method");
	}
	
}

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B1 a= new B1();
		a.test1();
		a.test2();
		a.test3();
		a.test4();
	}

}

//Assignment:
//Write an example for method overriding
//write an example for abstraction
	
