/*
 Abstract class can not be instantiated
 we can not create the object of abstract class
 */
package abstractKeyword;
abstract class Shape
{
	Shape()
	{
		System.out.println("Default constructor of Parent class");
	}
	// non abstract method/concreate method
	public void fun()
	{
		System.out.println("Inside fun method");
	}
	// abstract method: it does not have any method body
	abstract void draw(); // it is the responsibility of child class to override the abstract method of parent class
}
class Circle extends Shape
{
	Circle()
	{
		System.out.println("Default constructor of child class class Circle");
	}
	public void draw()
	{
		System.out.println("Drawing Circle");
	}
	}
public class AbstractClassDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Shape s1=new Shape(); error
		Circle c1=new Circle();
		c1.fun();
		c1.draw();
		
	}

}
