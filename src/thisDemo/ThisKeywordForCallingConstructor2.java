package thisDemo;
class B
{
	int b;
	B(int i)
	{
		this(); // it will cal default constructor
		b=i;
		System.out.println("Paramerized Constructor with value of b: "+b);
	}
	B()
	{
		System.out.println("Default Constructor");
	}
}
public class ThisKeywordForCallingConstructor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B ob1=new B(50);
		

	}

}
