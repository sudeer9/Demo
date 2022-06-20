package com.BasentTechnologies;

/*
We can have name for each for loop. To do so, we use label before the for loop. 
It is useful if we have nested for loop so that we can break/continue specific for loop.

Normally, break and continue keywords breaks/continues the inner most for loop only.
*/
public class D62_LabeledForExample2
{
	public static void main(String[] args)
	{
		aa:
			for(int i=1;i<=3;i++)
			{
				bb:
					for(int j=1;j<=3;j++)
					{
						if(i==2&&j==2)
						{
							break aa;//If you use break bb;, it will break inner loop only which is the default behavior of any loop.
						}
						System.out.println(i+""+j);
					}
			}
	}

}
