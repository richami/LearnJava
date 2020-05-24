/*
 * It is compulsory for a child class to implement all the abstract
 * methods declared in interface
 * Demo of Single level inheritance 1 parent 1 child class
 */
package interfaceKeyword;
interface Printable
{
	abstract void print();
	void show();
	void m1();
}
class A implements Printable
{
	@Override
	public void print()
	{
		System.out.println("Hello Interface");
	}
	
	public void fun()
	{
		System.out.println("Inside fun");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Hello show");
	}
	@Override  // to override m1() in Printable interface line-10
	public void m1() {}
}
public class InterfaceDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A onj=new A();
		onj.print();
		onj.fun();
		onj.show();
	}

}
