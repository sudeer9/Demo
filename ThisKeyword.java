package p1;

public class ThisKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e= new Emp(5);
		System.out.println(e.i);

	}

}

class Emp
{
	int i; //default values for byte,short,int and long=0, for double and float=0.0
	//for char=empty, for String=null
	Emp(int i)
	{
		this.i=i;
	}
}
