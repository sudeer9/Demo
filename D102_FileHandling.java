package com.BasentTechnologies;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class D102_FileHandling {
//This prog is for for creating new file.Writing data into file
	public static void main(String[] args) throws IOException
	{
		File f1=new File("D:\\FileHandling.txt");
		//to create file. It will create file if it doesn't exist
		f1.createNewFile();
		System.out.println(f1.exists());
		
		//to write data into file
				FileWriter fr=new FileWriter("D:\\FileHandling.txt");
				//to write in 1st line
				fr.write("Selenium Automation Testing");//it will be stored in Ram and when you FLUSH/close file then it will be written into file
				fr.flush();//this is like saving the file after writing data
				//fr.close();//If you close the file here, you cannot write data into next line using below code
						
				//to write data into next line
				BufferedWriter br= new BufferedWriter(fr);
				br.newLine();
				br.write("Manual Testing");
				br.flush();
				br.close();
	}

}
