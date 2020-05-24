//WAP to input a no and check if it prime no or not
// prime no is a no which is divided by 1 and itself ex 2 3 5, 7, 11...	
// 5                div by 1 and 5    try 1, 2, 3, 4, 5 
package decisionmaking;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no: ");
		int n=sc.nextInt();
		int c=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				c++;
		}
		if(c==2)
			System.out.println("Prime no");
		else
			System.out.println("Not a Prime no");

	}

}
