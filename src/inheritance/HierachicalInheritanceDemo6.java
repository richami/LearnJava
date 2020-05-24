/*
 Hierarchical Inheritance: More than 1 child class inherit from 1 base class
 No of base classes: 1
 No of child classes: More than 1
 */
package inheritance;
class Shape
{
	// public: it can access anywhere(within the class/package, outside the package)
	// void method will not return anything
	public void draw()
	{
		System.out.println("Drawing shape");
	}
	// int: here int is the Return Type
	// method sum will return an int value
	public int sum(int a, int b)
	{
		int c=a+b;
		return c;
	}
}
class Triangle extends Shape
{
	public void drawTriangle()
	{
		System.out.println("Drwaing triangle shape");
	}
}
class Circle extends Shape
{
	public void drawCircle()
	{
		System.out.println("Drawing Circle shape");
	}
}
class Square extends Shape
{
	public void drawSquare()
	{
		System.out.println("Drawing Square Shape");
	}
}
public class HierachicalInheritanceDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t=new Triangle();
		t.draw();
		t.drawTriangle();
	}

}
