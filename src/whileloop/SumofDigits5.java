//WAP to input a no and print the sum of its digits ex 135 sum 9
package whileloop;

import java.util.Scanner;

public class SumofDigits5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no: ");
		int n=sc.nextInt();
		while(n>0)
		{
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.println("Sum: "+sum);
		/*for(;n>0;n=n/10)
		{
			r=n%10;
			sum=sum+r;
		}
		for(;n>0;)
		{
			r=n%10;
			n=n/10;
		}*/
	}

}
