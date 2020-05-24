package com.multidemensionalarray;
import java.util.*;
public class SumOfLeftDiagonal5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		//Declare 2D array
		int a[][]=new int[3][3]; // here #rows=#columns
		int i,j;
		//Input in 2D array
		System.out.println("Enter elements: ");
		for(i=0;i<3;i++)
			for(j=0;j<3;j++)
				a[i][j]=sc.nextInt();
		//logic to find sum of left diagonal
		int s=0;
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				if(i==j)
					s=s+a[i][j]; // or s+=a[i][j]; shorthand operator
			}
		}
		System.out.println("Sum of left diagonal: "+s);

	}

}
