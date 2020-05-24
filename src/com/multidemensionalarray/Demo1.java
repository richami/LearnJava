package com.multidemensionalarray;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare
		int a[][]=new int[3][4];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values: ");
		for(int i=0;i<3;i++)// here i is for rows
		{
			for(int j=0;j<4;j++)//here j is for columns
			{
				a[i][j]=sc.nextInt();
			}
		}
		//print the elements
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}
