//WAP to input a number and print its table till 10
/*	n * i = n*i
 *  7 * 1 = 7
 * 	7 * 2 = 14
 * .
 * .
 * .
 * .
 *  7 * 10 = 70
 */
package loops;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no: ");
		int n=sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			// 7 * 1 = 7
			System.out.println(n+" * "+i+" = "+(n*i));
		}

	}

}
