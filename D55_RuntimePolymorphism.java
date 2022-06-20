package com.BasentTechnologies;
interface Animals
{
	void makeSound();
	
}
class Dogs implements Animals
{
	public void makeSound()
	{
		System.out.println("Bow Bow");
	}
}

class cats implements Animals
{
	public void makeSound()
	{
		System.out.println("Meow Meow");
	}
}

public class D55_RuntimePolymorphism {

		public static void main(String[] args) 
		{
			
			// TODO Auto-generated method stub
			//Animals a;//here "a" is a polymorphic variable
			  Animals a=new Dogs();
			a.makeSound();//this is runtime polymorphism bcoz by looking at this statement, we can't say which method of the class will be executed
						//it is decided during run time (this line is dependent on previous line and executes the code.)
			
			 Animals a1= new cats();
			a1.makeSound();
			

		}

	}

	