package com.BasentTechnologies;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class D104_ArrayList1 {
	
	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("java");
		al.add("Manual");
		al.add("java");//it allows duplicate values
		al.add("sudeer");
		
        System.out.println(al);
       
        
		System.out.println(al.size());//prints size of the array
		
		//Retrieving the object/elements using for-loop
		System.out.println("Output using for loop");
		for(int i=0;i<al.size();i++)
		{
			String obj = al.get(i);
			System.out.println(obj);
		}
		
		//Retrieving the object using for-each loop
        System.out.println("Output using for-each loop");
        for(String i:al)//
        {
        	System.out.println(i);
        }
        
      //Retrieving the objects using 'Iterator
      	System.out.println("Output using 'Iterator'");
      	
      	  Iterator<String> itr = al.iterator();
      	while(itr.hasNext())
      	{
      		String obj1 = itr.next();
      		System.out.println(obj1);
      	}
      	
      //Retrieving the objects using 'ListIterator
       System.out.println("Output using List Iterator");
       ListIterator<String> itr1 = al.listIterator();
       //Output in forward direction
       System.out.println("Output in forward direction");
       while(itr1.hasNext())
       {
    	   String obj2 = itr1.next();
     	   System.out.println(obj2);
       }
     //Output in reverse direction
       System.out.println("Output in reverse direction");
       while(itr1.hasPrevious())
       {
    	   String obj3 = itr1.previous();
     	   System.out.println(obj3);
       }
 
	}

}
