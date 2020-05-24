/*
 final variable id declared using final keyword
 eg final int a;
 if i have not initialized any value to final var then it is known as blank final variable
 And it can be assigned in constructor only
 */
package finalKeyword;
class A
{
	final int a;
	A()
	{
		a=10;
	}
	public void display()
	{
		//a=20; error
		System.out.println(a);
	}
}
public class BlankFinalVariable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ob=new A();
		ob.display();
	}

}
