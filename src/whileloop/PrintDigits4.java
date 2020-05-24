//WAP to input a no and print its digits
package whileloop;

import java.util.Scanner;

public class PrintDigits4 {

	public static void main(String[] args) {
		int r;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		int n=sc.nextInt(); //initialization
		while(n>0) //condition
		{
			r=n%10;			//take the remainder as r
			System.out.println(r);// print the remainder
			n=n/10;			//take qutiont
		}
	}

}
