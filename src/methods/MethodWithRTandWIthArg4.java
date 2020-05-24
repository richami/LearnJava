package methods;

import java.util.Scanner;

class D
{
	public int sum(int a,int b) // Method declaration and defination
	{
		return a+b;
	}
}
public class MethodWithRTandWIthArg4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D d=new D();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two no: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int s=d.sum(a, b); // method calling
		System.out.println("Sum of two no: "+s);
	}

}
