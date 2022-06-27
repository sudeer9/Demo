package com.BasentTechnologies;

import java.io.FileNotFoundException;
import java.io.FileReader;

//throws keyword to declare exception
public class D96_Exception 
{
	public static void main(String[] args) throws FileNotFoundException, InterruptedException 
	{
		FileReader fr= new FileReader("D:\\test.txt");
		Thread.sleep(2000);
	}
}
