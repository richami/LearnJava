// Nested if: if inside if
//Max Among 3 nos
package decisionmaking;

import java.util.Scanner;

public class NestedIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter three numbers: ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt(); //a=5, b=2, c=1
		if(a>b)
		{
			if(a>c)
				System.out.println(a+"is greatest");
			else
				System.out.println(c+" is greatest");
		}
		else if(b>a)
		{
			if(b>c)
				System.out.println(b+" is greatest");
			else
				System.out.println(c+" is greatest");
		}
		else
			System.out.println(c+" is greatest");

	}

}
