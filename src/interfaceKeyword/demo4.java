package interfaceKeyword;
abstract class C
{
	abstract void m1();
	public void m2()
	{
		System.out.println("m2");
	}
}
class D
{
	public void m1()
	{
		System.out.println("m1");
	}
}
// class G extends A implements Printable1         Multiple inheritance
/*class E extends C,D
{
	// m1() from C
	// m2() from C
	// m1() from D ambiguity is there
	public void m2()  ambiguity is there because of 2 copies of m2()
	{
		System.out.println("inside E");
	}
}*/
public class demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
