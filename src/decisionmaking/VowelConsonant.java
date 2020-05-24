// WAP to input a char and check if it is a vowel or a consonent
package decisionmaking;

import java.util.Scanner;

public class VowelConsonant {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character: ");
		s=sc.next();
		ch=s.charAt(0);
		if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			System.out.println("vowel");
		else
			System.out.println("consonant");
			
		
	}

}
