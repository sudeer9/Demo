package p1;

public class Methodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=add(10, 10);
		System.out.println(result);
		System.out.println(add(5,16));
		
		System.out.println(add(5,16,2));
		
		System.out.println(add(5.5,10));

	}
	
	public static int add(int a , int b)
	{
		//int c=a+b;
		//return c;
		return a+b;
	}
	
	public static int add(int a , int b, int c)
	{
		
		return a+b+c;
	}
	
	public static double add(int a , double b)
	{
		
		return a+b;
	}
	
	public static double add(double a , int b)
	{
		
		return a+b;
	}
	
	public static int add(int a , int b, int c, int d)
	{
		
		return a+b+c+d;
	}
	

}

//Assignment 2
//Write an example for method overloading for multiplication, division and subtraction
