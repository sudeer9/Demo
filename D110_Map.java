package com.BasentTechnologies;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class D110_Map 
{	
	public static void main(String[] args) 
	{
		HashMap<Integer,String> map=new HashMap<Integer,String>();  
		  map.put(1,"sudeer");  
		  map.put(2,"sonu");  
		  map.put(3,"peter");
		  map.put(4,"jackson");
		  map.put(null,null);
		  map.put(5,null);
		  
		  System.out.println(map);
		  
		  for(Map.Entry m:map.entrySet())
		  {  
		   System.out.println(m.getKey()+"->"+m.getValue());  
		  }  
		  
		  System.out.println("==============================");
		  
		  String getValue = map.get(3);//to get value based on the key
		  System.out.println(getValue);
		  System.out.println("==============================");
		  
		  
		  //Map can't be traversed so you need to convert it into Set using keySet() or entrySet() method.
		  //Traversing Map
		  Set set=map.entrySet();//Converting to Set so that we can traverse  
		  Iterator itr=set.iterator();  
		  while(itr.hasNext())
		  {  
		      //Converting to Map.Entry so that we can get key and value separately  
			  Object result = itr.next();
			  System.out.println(result);
				  
		  }  
		 
		  //to remove key and value set based on key
		map.remove(2) ;
		System.out.println(map);
		//to remove key and value set based on key and value
		//map.remove("sudeer");
		map.remove(1,"sudeer");//Removes the entry for the specified key only if it is currently mapped to the specified value.
		System.out.println(map);
		map.remove(4,"jackson");
		System.out.println(map);
		
	}

}
