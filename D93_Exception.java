package com.BasentTechnologies;

public class D93_Exception {

	//This is for finally block
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{  
			   int data=25/5;  //exception occurs
			   System.out.println(data);  
			  }  
			  catch(ArithmeticException e)//handling the exception
			  {
				  System.out.println(e);
				  
			  }  

		finally//finally block is always executed whether
				//the exception occurs or not
		{
			//System.exit(1);
			
			System.out.println("finally block is always executed");
			System.out.println("rest of the code..."); 
		}  

	}

}