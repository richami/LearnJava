/*
 	1	0	0
 	2	3	1
 	2	0	1
 sum5	3	2	
 */
package com.multidemensionalarray;

import java.util.Scanner;

public class SumofEachColumn4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		//logic for sum of each coloum
		for(int i=0;i<3;i++)
		{
			int sum=0;
			for(int j=0;j<3;j++)
			{
				sum=sum+a[j][i];
			}
			System.out.println("Sum of"+(i+1)+" Column : "+sum);
		}
		
	}

}
