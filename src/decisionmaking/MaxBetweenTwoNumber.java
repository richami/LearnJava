//WAP to max between two number
package decisionmaking;

import java.util.Scanner;

public class MaxBetweenTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a>b)
			System.out.println(a+" is greater");
		else
			System.out.println(b+" is greater");
		System.out.println("ENd of program");
	} //end of main

} // end of class
