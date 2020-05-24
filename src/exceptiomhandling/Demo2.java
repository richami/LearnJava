// Arithmetic Exception user input
package exceptiomhandling;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=0;
		try
		{
		c=a/b;
		System.out.println(c);
		}
		catch(Exception ob)
		{
			System.out.println(ob);
			System.out.println("invalid input");
		}
		System.out.println("end of code");
	}

}
