package p1;

final class Animal
{
	   void move()
	{
		System.out.println("All the animals will move from one place to anothoer place");
	}
	  
}

class Dog extends Animal
{
	  void move()
	{
		int fronLegs=2;
		int backLegs=2;
		System.out.println("dogs will have front legs ="+fronLegs+" and backlegs= "+backLegs);
		System.out.println("Dogs will move from one place to another place by walking and running");
		}
	}



public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d= new Dog();
		d.move();
		Animal a= new Animal();
		a.move();
		
		final int i=10;
		//i=20;

	}

}
