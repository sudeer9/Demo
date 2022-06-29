package com.BasentTechnologies;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class D111_CollectionsClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();  
        list.add(3);  
        list.add(2);  
        list.add(5);  
        list.add(6);  
        list.add(4);  
        list.add(1);  
        System.out.println(Collections.max(list)); 
        System.out.println(Collections.min(list));
       
        Collections.addAll(list, 7,8,9);
        System.out.println(list);
        
        System.out.println("==================================");
        //to sort in ascending order
        Collections.sort(list);
        System.out.println(list);
       
        System.out.println("==================================");
        
      //to sort in descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
      
      //to sort in reverse order 1 4 2 5 3 -> 3 5 2 4 1
        Collections.reverse(list);
        System.out.println(list);
        
        List<Integer> list1 = new ArrayList<Integer>(); 
        list1.add(51);
        list1.add(52);
        list1.add(53);
        Collections.copy(list, list1);
        System.out.println(list);
        

	}

}
