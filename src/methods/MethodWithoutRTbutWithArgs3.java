package methods;

import java.util.Scanner;

class C
{
	public void sum(int a,int b)
	{
		int c=a+b;
		System.out.println("Sum: "+c);
	}
}
public class MethodWithoutRTbutWithArgs3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c=new C();
		c.sum(10, 20);
		// input from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two no: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		c.sum(a, b);
	}

}
