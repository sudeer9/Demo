package com.BasentTechnologies;

import java.io.File;

public class D101_FileHandling 
{
	public static void main(String[] args)
	{
		File f1= new File("D:\\FileHandling");
		//to check folder exists or not
		System.out.println(f1.exists());//returns true/false
		//to delete a folder if exist
		f1.delete();
		//to check folder exists or not
		System.out.println(f1.exists());
	}

}
