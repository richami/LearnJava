package com.multidemensionalarray;

public class Demo2 {

	public static void main(String[] args) {
		int a[][]= {{23,44,56},{34,56,67},{235,56,78}};
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+"\t"); // /t is for 4 spaces
			}
			System.out.println();
		}
	}

}
