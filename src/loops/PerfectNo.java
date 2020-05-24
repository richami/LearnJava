//WAP to input a no and check if it is perfect no or no
// 6		sum of its factors(excluding no itself)= same no
// 6		1+2+3=6
package loops;

import java.util.Scanner;

public class PerfectNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no: ");
		int sum=0;
		int n=sc.nextInt();
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
				sum=sum+i;
		}
		if(n==sum)
			System.out.println("Perfect No");
		else
			System.out.println("No a Perfect number");

	}

}
