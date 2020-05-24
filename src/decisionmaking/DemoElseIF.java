//WAP to input a char and check wheather it is uppercase or lower case
package decisionmaking;

import java.util.Scanner;

public class DemoElseIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//String index always starts with 0
		String s; // String is a class s is object/var
		char ch; //char is a datatype and ch is a variable
		System.out.println("ENter a char: ");
		s=sc.next(); //It will accept string s=rahul 
		ch=s.charAt(0); //ch=r
		if(ch>='A' && ch<='Z')
			System.out.println("Uppercase");
		else if(ch>='a' && ch<='z')
			System.out.println("Lowercase");
		else
			System.out.println("Not a char");
		//else is optional
	}

}
