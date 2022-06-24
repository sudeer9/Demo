package com.BasentTechnologies;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class D92_Exception {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileReader fr= new FileReader("D:\\test.txt");
			
		}
		catch(Exception e)
		{
			System.out.println("File is not found -This is from 2nd catch block");
		}
		
		catch(FileNotFoundException e)
		{
			System.out.println("File is not found -This is from 1st catch block");
		}
		

	}

}
