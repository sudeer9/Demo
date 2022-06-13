package p1;
public class NonStaticMembers {
	static int i=10;
	int j=20;

	public static void main(String[] args) 
	{
		//int i=30;
		int j=40;
		//create object/instance of a class
		//syntax
		// className refVariable=new className();
		NonStaticMembers a=new NonStaticMembers();
		a.test1();
		NonStaticMembers1 a1=new NonStaticMembers1();
		a1.test2();
		test10();
		NonStaticMembers1.test20();
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(a.j);

	}
	
	public static void test10()
	{
		System.out.println("test 10 method");
	}
	public void test1()
	{
		System.out.println("test 1 method");
	}

}

class NonStaticMembers1
{
	public void test2()
	{
		System.out.println("test 2 method");
	}
	
	public static void test20()
	{
		System.out.println("test 20 method");
	}
}
