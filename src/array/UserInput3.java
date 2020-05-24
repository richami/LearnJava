//WAP to input an array of 7 int elements and print it
package array;

import java.util.Scanner;

public class UserInput3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[7];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 7 elements into an array: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		 /*a[0]=sc.nextInt();
		 a[1]=sc.nextInt();
		 a[2]=sc.nextInt();
		 a[3]=sc.nextInt();
		 a[4]=sc.nextInt();
		 a[5]=sc.nextInt();
		 a[6]=sc.nextInt();*/
		System.out.println("***************************");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
