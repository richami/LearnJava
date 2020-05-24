//WAP for modulus operator
package operators;

import java.util.Scanner;

public class Arthmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		// Arithmetic operators + - * / % (works only with int data type)
		int a,b,r;
		System.out.println("enter two numbers: ");
		a=sc.nextInt();
		b=sc.nextInt();
		r=a%b;
		int d=a/b;
		System.out.println("remainder is: "+r);
		System.out.println("q: "+d);
	}

}
