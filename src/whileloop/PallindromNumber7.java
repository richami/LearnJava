/*
 * WAP to input a no and check if it is pallindrome
 * 121
 * reverse: 121
 * pallindrome
 * find the reverse
 *    find last digit   				1		2		1
 *    multiply last digit with 10(rev)	10      12      121
 *    take qutiont						12		1		0
 *    compare reverse with input value same pallindrome else not a pallindrome
 */
package whileloop;

import java.util.Scanner;

public class PallindromNumber7 {

	public static void main(String[] args) {
		int r,rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no: ");
		int n=sc.nextInt();
		int m=n;
		while(n>0)
		{
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		System.out.println("Reverse: "+rev);
		if(rev==m)
			System.out.println("Pallindrome");
		else
			System.out.println("Not a pallindrome");
	}

}
