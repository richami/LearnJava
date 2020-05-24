package interfaceKeyword;
interface Printable1 // parent 1
{
	abstract public void print();
}
interface Showable // Parent 2
{
	abstract public void show();
}
class B implements Printable1,Showable // Multiple Inheritance
{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Show");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("print");
	}
	
}
public class MutlipleInheritancethroughInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		b.print();
		b.show();
	}

}
