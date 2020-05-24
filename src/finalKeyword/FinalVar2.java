// WA method cal Area() and display()
// final variable can be inherited
package finalKeyword;
class Circle
{
	double area,radius; // instance var
	final double pi=3.14; // final variable/ Constant
	
	Circle(double radius)
	{
		this.radius=radius;
	}

public void calArea()
{
	area=pi*radius*radius;
	System.out.println("Area of circle: "+area);
}
}
class B extends Circle
{
	B(double radius)
	{
		super(radius);
	}
	public void display()
	{
		System.out.println(pi);
	}
	}
public class FinalVar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle x=new Circle(10);
			x.calArea();
			B ob=new B(5.2);
			ob.display();
	}

}
