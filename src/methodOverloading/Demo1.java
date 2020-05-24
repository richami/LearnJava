/*
 Method overloading: Method with the same name but different argument
 argument can be differ in two ways:
 by type of arg
 by no of argument
 ex By type of argument
 */
package methodOverloading;
class CalculateArea
{
	public void area(double r) // m1 takes 1 argument of type double
	{
		System.out.println("Area of circle: "+(3.14*r*r));
	}
	public void area(int l,int b) //m2 takes 2 arg of type int
	{
		System.out.println("Area of Reactangle: "+(l*b));
	}
	public void area(int s)//m3
	{
		System.out.println("Area of square: "+s*s);
	}
}
public class Demo1 {

	public static void main(String[] args) {
		CalculateArea obj=new CalculateArea();
		obj.area(10,20); // invoke m2
		obj.area(5); //invoke m3
		obj.area(5.2); // invoke m1
	}

}
