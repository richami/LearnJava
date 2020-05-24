package methodOverloading;
class A
{
	public void sub(double a, int b) //m1  sequence of argument must not be same
	{
		System.out.println(a-b);
	}
	public void sub(int p, double q) // m2
	{
		System.out.println(p-q);
	}
}
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		a.sub(10.5, 5); // invoke m1
		a.sub(10,5.2); // invoke m2
		// a.sub(2, 5); error of ambiguity
	}

}
