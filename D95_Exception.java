package com.BasentTechnologies;

//The Java throw keyword is used to explicitly throw an exception.
//We can throw either checked or uncheked exception in java by throw keyword.
//The throw keyword is mainly used to throw custom exception.

public class D95_Exception 
{

	static void verify(int age)
	{ 
	     if(age<21) 
	     
	      throw new ArithmeticException("Not eligilbe to get married"); 
	     
	     else 
	     
	      System.out.println("Eligible to get married");
	     
	   }  
	   public static void main(String args[]){  
	      verify(27);  
	      System.out.println("rest of the code...");  
	  }  
	}  