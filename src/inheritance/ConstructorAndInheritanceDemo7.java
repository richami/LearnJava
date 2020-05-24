/*
 when you create the object of child class, then if parent class
 has a constructor then by default parent class constructor is
 invoke first and then the child class constructor is invoked
 Note: Constructor Name must be same as that of class Name
 */
package inheritance;
class A
{
	A()
	{
		System.out.println("Constructing A");
	}
}
class B extends A
{
	B()
	{
		System.out.println("Constructing B");
	}
}
public class ConstructorAndInheritanceDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B(); // first execute class A constructor then class B constructor
	}

}
