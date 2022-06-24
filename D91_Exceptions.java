package com.BasentTechnologies;

public class D91_Exceptions 
{
		
	public static void main(String[] args) 
	{
			
		//There are 5 keywords which are used in handling exceptions in Java
		//try,catch,finally,throw and throws

			int i=10;
			int j=0;
			try
			{
			int k=i/j;//this will throw an exception bcoz we can't divide a number by zero
			System.out.println(k);
			}
			catch(Exception e)
			{
				System.out.println("cannot divide by zero");
				System.out.println(e);
			}
			
		}

	}
