package com.BasentTechnologies;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class D103_FileHandling {
	public static void main(String[] args) throws IOException 
	{
		//This prog is for reading data from file
		FileReader fr=new FileReader("D:\\FileHandling.txt");
		
		  System.out.println(fr.read());
		  // it will read the 1st character from 1st line
		  //and it will print //the ACSII code, so to see the character in console we
		  //need to convert ascii code to character //ASCII code for a to z starts from
		  //97 to 122 //ASCII code for A to Z starts from 65 to 91
		  
		  //To convert ACSII code to character 
		  int f = fr.read();
		  //this will read and convert 2nd charcter bcoz we read 1st charcter in the above line
		  //char c=(char)f; 
		  System.out.println((char)f);
		 
		
		//Below code to convert all ASCII numbers into characters and print
		int i=0;
		while((i=fr.read())!=-1)
		{
			char h = (char)i;
			System.out.print(h);
		}
		
		
		System.out.println("\n=========================================");
		
		//instead of above code we can use buffered reader to read the data as written below
		FileReader fr1=new FileReader("D:\\FileHandling.txt");
		BufferedReader br= new BufferedReader(fr1);
		System.out.println(br.readLine());
		System.out.println(br.readLine());
		System.out.println(br.readLine());//it will give null as output if data is not there in next line
		
		
	

	}

}
