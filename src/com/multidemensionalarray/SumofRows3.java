//WAP to find sum of each row in 3x3 matrix
package com.multidemensionalarray;

import java.util.Scanner;
public class SumofRows3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//declaration of 2D array
		int a[][]=new int[3][3];
		System.out.println("Enter Elements: ");
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				a[i][j]=sc.nextInt();
		System.out.println("**************************");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
		System.out.println("\n");
		}
		//logic for sum of each row
		int sum=0;
		for(int i=0;i<3;i++)
		{
			sum=0;
			for(int j=0;j<3;j++)
			{
				sum=sum+a[i][j]; //0+a[0][0]+a[0][1]+a[0][2]
			}
			System.out.println("Sum: "+sum);
		}
	}

}
