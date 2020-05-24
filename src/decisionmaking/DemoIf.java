// WAP to print welcome if user enter value 10
//if there is only single line to execute inside if then we don't need {}
// = is a assignment operator eg int a=10
// == is a comparison operator eg a==10
package decisionmaking;

import java.util.Scanner;

public class DemoIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter a number: ");
		int a=sc.nextInt();
		if(a==10)
		{
			System.out.println("welcome");
			System.out.println("Condition is true");
		}
		System.out.println("ENd of the program");

	}

}
