/*
 * we dont have to use super in case of default constructor
 */
package superKeyword;
class A
{
	A()
	{
		System.out.println("Construcor of A");
	}
}
class B extends A
{
	B()
	{	
		super(); // optional
		System.out.println("Constructor of B");
	}
}
public class SuperInDefaultConstructor3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B ob=new B();
	}

}
