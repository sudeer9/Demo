package com.BasentTechnologies;

import java.io.File;

//To Create folder
public class D100_FileHandling 
{
	public static void main(String[] args)
	{
		File f1= new File("D:\\FileHandling");//we can use "//"
		//to check folder exists or not
		System.out.println(f1.exists());//returns true/false
		//to create a folder if does not exist
		f1.mkdir();
		//f1.delete();
		//to check folder exists or not
		System.out.println(f1.exists());
	}

}
