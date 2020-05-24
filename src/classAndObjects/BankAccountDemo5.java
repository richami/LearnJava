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

class Account
{
	int accno;
	double balance;
	String name, address,phone;
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter accno, balance, name, address and phone: ");
		accno=sc.nextInt();
		balance=sc.nextDouble();
		address=sc.next();
		phone=sc.next();
	}
	public void checkBalance()
	{
		System.out.println("Balance: "+balance);
	}
	public void deposit(double amt)
	{
		balance=balance+amt;
		System.out.println("deposited "+amt);
		System.out.println("New Balance: ");
		checkBalance();
	}
	public void withdraw(double amt)
	{
		// condition 1000 must left in balance after withdraw
		if(amt>balance)
			System.out.println("Insufficient balance");
		else if(balance-amt>=1000)
		{
			System.out.println("Current balance before withdraw: "+balance);
			balance=balance-amt;
			System.out.println("Balance after withdraw: ");
			checkBalance();
		}
		else
		{
			System.out.println("invalid");
		}
	}
}
public class BankAccountDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1=new Account();
		a1.input(); // go to line 35
		a1.checkBalance();
		a1.withdraw(12000);
		a1.deposit(2000);
		a1.withdraw(1050);
	}

}
