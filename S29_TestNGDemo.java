
package com.scripts;

import org.testng.annotations.Test;

public class S29_TestNGDemo 
{
	final int i=3;
	@Test(invocationCount = i)
	void a()
	{
		System.out.println("methhod a");
	}
	
	@Test
	void b()

	{
		System.out.println("methhod b");
	}

	
}
