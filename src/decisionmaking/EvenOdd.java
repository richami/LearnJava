//WAP to input a no and check if it is even or odd
//WAP to input a number and check if it is divisible by 7
//WAP to input a number and check if it is divisible by 3 and 5
//WAP to input a number and check it is divisible by 3 but not by 7
package decisionmaking;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create object of Scanner class to take input from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		//Declare a int variable and take input from user
		int n=sc.nextInt(); //n=13
		if(n%2==0)  //13%2=1, 1==0 false
			System.out.println("Even no");
		else
			System.out.println("Odd no");
	}

}
