/*
 Program to show why Multiple inheritance can be achieve by interface 
 only
 Even if Both the interfaces have the same method name
 still child class will override only 1 method then in this way
 there will not be any ambiguity
 */
package interfaceKeyword;
interface Printable2
{
	abstract public void print();
}
interface Showable2
{
	abstract public void print();
}
class F implements Printable2,Showable2
{
	public void print() // overriding the print() from both interfaces
	{
		System.out.println("Mutiple Inheritance possible");
	}
}
public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		F f=new F();
		f.print();
	}

}
