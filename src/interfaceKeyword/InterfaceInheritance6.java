package interfaceKeyword;
interface Printable3                      // GrandFather
{
	abstract void print();
}
interface Showable3 extends Printable3		// Father
{
	abstract void show();
}
class H implements Showable3				// Son
{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Print");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Show");
	}
	
}
public class InterfaceInheritance6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		H h=new H();
		h.print();
		h.show();
		/*
		Showable3 s=new H(); // up casting 
		s.print();
		s.show();
		Printable3 p=new H(); // up casting
		p.print();
		// p.show(); // Printable3 don't have show() information*/
	}

}
