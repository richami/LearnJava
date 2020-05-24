package inheritance;
class C
{
	C()
	{
		System.out.println("C constructor");
	}
}
class D extends C
{
	D()
	{
		super(); // it will call base class constructor
		System.out.println("D Constructor");
	}
}
public class SuperKeyword8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D d=new D();
	}

}
