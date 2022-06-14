package p1;

public class ParameterizedCTT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e=new Employee("John",35);
		System.out.println(e.age+"->"+e.name);
		System.out.println(e.name);
		
		Employee e1=new Employee("Peter",55);
		System.out.println(e1.age+"->"+e1.name);

	}

}

class Employee
{
	int age;
	String name;
	
	Employee(String n, int a)
	{
		age=a;
		name=n;
	}
			
}
