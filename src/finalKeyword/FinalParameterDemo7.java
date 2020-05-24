package finalKeyword;
class Calculate
{
	public void cube(final int n)
	{
		//n=n+2;
		System.out.println(n*n*n);
	}
}
public class FinalParameterDemo7 {
	public static void main(String a[])
	{
		Calculate c1=new Calculate();
		c1.cube(2);
		c1.cube(5);
	}
}
