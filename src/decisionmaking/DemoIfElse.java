//WAP to enter age and check whether the person is eligible to vote or not
package decisionmaking;

import java.util.Scanner;

public class DemoIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age of a person: ");
		int age=sc.nextInt();
		if(age>=18)
			System.out.println("Eligible to vote");
		else
			System.out.println("Not eligible to vote");
	}

}
