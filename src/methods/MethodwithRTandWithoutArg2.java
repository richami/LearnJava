package methods;

import java.util.Scanner;

class B
{
	public int sum() // here int is the return type
	{
		int a,b,sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two no: ");
		a=sc.nextInt();
		b=sc.nextInt();
		sum=a+b;
		return sum;
	}
}
public class MethodwithRTandWithoutArg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		int s=b.sum(); // here s will catch the value of sum return by sum() method line 15
		System.out.println("Sum: "+s);
	}

}
