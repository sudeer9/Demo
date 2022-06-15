package p1;

class A
{
	void test1()
	{
		System.out.println("test1 method");
	}
}

class B extends A
{
	void test2()
	{
		System.out.println("test2 method");
	}
}

class C extends B
{
	void test3()
	{
		System.out.println("test3 method");
	}
}


public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		a.test1();
		
		B b=new B();
		b.test2();
		
		C c= new C();
		c.test1();
		c.test2();
		c.test3();

	}

}
