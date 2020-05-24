/*
 Create a class Account with instance variables as:
 	accno		int
 	balance		double
 	name		String
 	address		String
 	phone		String
 	create methods:
 	input() take input from user accno, balance, name,address,phone
 	checkBalnce() display the balance
 	deposit(int amt) increase balance with this amt
 	withdraw(int amt)
 	check wheather amt is available in the balance
 	eg balance 10000  amt 20000
 	if amt is not available display insufficient balance
 	if amt is available deduct the amount from balance
 	
 	changes:
 	take input for amt to be deposited and withdraw
 	make this menu driven
 	enter 1 to deposit
 	enter 2 to withdraw
 	enter 3 to check balance
 	enter 4 to quit
 */

package classAndObjects;

import java.util.Scanner;


public class MenuDrivenBankAccount6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch; // to take choice (local variable)
		double amt;// to take amt deposited or withdraw
		Scanner sc=new Scanner(System.in);
		Account r=new Account(); // an object of class Account
		r.input();
		do  // do while loop use for menu driven, dowhile must be executed atleast once regardless of the condition
  		{
			System.out.println("Enter 1 to deposit the amt");
			System.out.println("Enter 2 to withdraw the amt");
			System.out.println("Enter 3 to check balance");
			System.out.println("Enter 4 to quit");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:System.out.println("Enter the amt to be deposit: ");
			       amt=sc.nextDouble();
			       r.deposit(amt);
			       break;
			case 2:System.out.println("Enter the amount to be withdrawn: ");
			       amt=sc.nextDouble();
			       r.withdraw(amt);
			       break;
			case 3:r.checkBalance();
					break;
			case 4:System.exit(0);
			default:System.out.println("Invalid input");
			}
		}while(ch<=4);
	}

}
