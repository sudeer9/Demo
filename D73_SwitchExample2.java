package com.BasentTechnologies;

public class D73_SwitchExample2 {  
public static void main(String[] args) {  
    int number=30;  
    switch(number){  
    case 10: System.out.println("10");  
    case 20: System.out.println("20");  
    case 30: System.out.println("30"); 
    case 40: System.out.println("40");
    case 50: System.out.println("50");
    default:System.out.println("Not in 10, 20 or 30");  
    }  
}  
}  

/*
Java Switch Statement is fall-through
The java switch statement is fall-through. It means it executes all statement after first match if break 
statement is not used with switch cases.
*/
