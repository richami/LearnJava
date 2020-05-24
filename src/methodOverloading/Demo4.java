/*
 * method overloading does not depend on return type of the method
 */
package methodOverloading;
class Calculate
{
	public double area(double r) // m1 takes 1 argument of type double
	{
		return (3.14*r*r);
	}
	public int area(int l,int b) //m2 takes 2 arg of type int
	{
		return (l*b);
	}
	public void area(int s)//m3
	{
		System.out.println("Area of square: "+s*s);
	}
}
public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate c=new Calculate();
		int a=c.area(10, 20);
		System.out.println(a);
		double b=c.area(5.2);
		System.out.println(b);
	}

}
