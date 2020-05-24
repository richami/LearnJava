package methods;

import java.util.Scanner;

class A
{
	public void sum()
	{
		int a,b,sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two no: ");
		a=sc.nextInt();
		b=sc.nextInt();
		sum=a+b;
		System.out.println("Sum: "+sum);
	}
}
public class MethodwithoutRTandwithoutArg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		a.sum();
	}

}
