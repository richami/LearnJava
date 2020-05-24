/*
 Method Overloading : no of argument is different
 */
package methodOverloading;
class CalculateSum
{
	public void sum(int a,int b) // m1
	{
		System.out.println("Sum of two no: "+(a+b));
	}
	public void sum(int a, int b, int c) //m2
	{
		System.out.println("sum of three numbers: "+(a+b+c));
	}
}
public class Demo2 {

	public static void main(String[] args) {
		CalculateSum obj=new CalculateSum();
		obj.sum(10,20); // invoke m1
		obj.sum(10,20,30); //invoke m2

	}

}
