package com.scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class S31_TestNGDemo2 
{
	@Test
	void d()
	{
		Reporter.log("method d",true);
	}
	
	@Test(priority = 2)
	void a()
	{
		Reporter.log("method a",true);
	}
	
	@Test(priority = 1)
	void c()
	{
		Reporter.log("method c",true);
	}
	
	@Test
	void b()
	{
		Reporter.log("method b",true);
	}
	//c b
	//b d
}



