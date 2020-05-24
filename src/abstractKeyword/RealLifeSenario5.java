/*
 * abstract class provide basic template kind of structure
 * child classes adds its own implementation to it
 * eg shape class has abstract method area()
 * child classes like Circle, Rectangle, Triangle provides its own 
 * implementation of area()
 * It is compulsory for every child class to override abstract method of parent class
 */
package abstractKeyword;
abstract class Shape1
{
	abstract public void area();
}
class Circle1 extends Shape1
{
	double r,a;
	Circle1(double r)
	{
		this.r=r;
	}
	@Override
	public void area()
	{
		a=3.14*r*r;
		System.out.println("Area of Circle : "+a);
	}
}
class Rectangle1 extends Shape1
{
	int l,b,a;
	Rectangle1(int a,int b)
	{
		l=a;
		this.b=b;
	}
	@Override
	public void area()
	{
		a=l*b;
		System.out.println("Area of Rectangle : "+a);
	}
}
class Triangle extends Shape1
{
	double b,h,a;
	Triangle(double b, double h)
	{
		this.b=b;
		this.h=h;
	}
	public void area()
	{
		a=0.5*b*h;
		System.out.println("Area of Triangle: "+a);
	}
}
public class RealLifeSenario5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle1 c1=new Circle1(5.2);
		c1.area();
		Rectangle1 r1=new Rectangle1(25,30);
		r1.area();
		Triangle t1=new Triangle(50,60);
		t1.area();
	}

}
