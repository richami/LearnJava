//WAP to input a char and convert its case
// A -> a				A-65 B-66 C-67 ...... Z-90
//						|						-32
//						+32						|
//a-> A					a-97 b-98 c-99 ...... z=122
package decisionmaking;

import java.util.Scanner;

public class ConvertCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s;
		char ch;
		System.out.println("Enter a char: ");
		s=sc.next();
		ch=s.charAt(0);
		if(ch>='A' && ch<='Z')
		{
			System.out.println("Uppercase");
			ch=(char) (ch+32); // coverting from uppercase to lowercase
			System.out.println("Coverted char: "+ch);
		}
		else if(ch>='a' && ch<='z')
		{
			System.out.println("Lowercase");
			ch=(char) (ch-32);
			System.out.println("Coverted char: "+ch);
		}
		else
			System.out.println("Invalid input");
		
		
	}

}
