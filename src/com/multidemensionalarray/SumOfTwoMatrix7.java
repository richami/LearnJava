//WAP to input two mutlidemensional array and find their sum
/*	a				b				c
 	1 1 1		1 2 3			2 3 4
 	0 2 3		0 0 1			0 2 4
 	3 4 1		1 1 0			4 5 1
 */
package com.multidemensionalarray;
import java.util.Scanner;
public class SumOfTwoMatrix7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);// take input from user
		int i,j; // for loop
		//Declare Matrix a, b and c
		int a[][]=new int[3][3];
		int b[][]= new int[3][3];
		int c[][]= new int[3][3];
		//Enter values in Matrix a and b
		System.out.println("Enter elements for Matrix A: ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter elements for Matrix B: ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("*****************************");
		System.out.println("Sum of a and b matrix is: ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}
		

	}

}
