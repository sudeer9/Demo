package p1;

public class DefaultCTT {

	  DefaultCTT()
	{
		System.out.println("default constructor");
	}
	  void test()
	  {
		  System.out.println("test method");
	  }
	
	public static void main(String[] args) 
	{
		DefaultCTT d=new DefaultCTT();
		Demo d1=new Demo();
		

	}
	

}

class Demo
{
	Demo()
	{
		System.out.println("Demo CTT");
	}
}
