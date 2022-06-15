package p1;

public class ConstructorOverloading 
{
	
	ConstructorOverloading()
	{
		System.out.println("default ctt");
	}
	
	ConstructorOverloading(int i)
	{
		System.out.println("1 param");
	}
	
	ConstructorOverloading(int i , int j)
	{
		System.out.println("2 parms");
	}
	
	ConstructorOverloading(int i, int j, int k)
	{
		this();
		//this(8);
		System.out.println("3 params");
		
	}

	public static void main(String[] args)
	{
		ConstructorOverloading c1=new ConstructorOverloading();
		ConstructorOverloading c2= new ConstructorOverloading(5);
		ConstructorOverloading c3= new ConstructorOverloading(1,2);
		ConstructorOverloading c4= new ConstructorOverloading(3,4,5);

	}

}
