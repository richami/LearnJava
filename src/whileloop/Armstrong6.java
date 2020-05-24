/*
 * WAP to input a no and check if it is armstrong or not
 * 153   //n
 * take last digit 				3			5				1
 * find last digit cube			3*3*3=27	5*5*5=125		1*1*1=1
 * take qutiont					15			1				0
 * sum of digits cube (27+125+1)= 153  //sum so got the same number
 * Armstrong
 */
package whileloop;

import java.util.Scanner;

public class Armstrong6 {

	public static void main(String[] args) {
		int r,sum=0,m;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no: ");
		int n=sc.nextInt();
		m=n;
		while(n>0)
		{
			r=n%10; //take remainder r=3, r=5, r=1
			sum=sum+(r*r*r); //sum=0+27, 27+125, 152+1
			n=n/10;			// n=15, n=1, n=0
		}
		System.out.println("n: "+n);
		System.out.println("sum: "+sum);
		if(sum==m)
			System.out.println("Armstrong");
		else
			System.out.println("Not Armstrong");
	}

}
