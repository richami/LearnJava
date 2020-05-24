//WAP to input a no and find its factors
// 6   factors: 1, 2, 3, 6
package loops;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Take input from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				System.out.print(i+", ");
		}

	}

}
