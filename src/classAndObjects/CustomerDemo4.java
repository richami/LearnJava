/*
 Create a class Customer with instance variables
 		name		age		
 	create methods
 	input() take the input from user using Scanner
 	show()	display name and age value to the user
 	Create another class as CustomerDemo write main method inside it 
 	and create 
 	objects of Customer class and call the input() and show()
 	
 */
package classAndObjects;

import java.util.Scanner;

class Customer
{
	int age;
	String name;
	public void input()
	{
		// here input method can access age and name instance var
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age and Name of the customer: ");
		age=sc.nextInt();
		name=sc.next();
	}
	public void show()
	{
		System.out.println("Age: "+age+"\t Name: "+name);
	}
}
public class CustomerDemo4 {

	public static void main(String[] args) {
		Customer c1=new Customer();
		Customer c2=new Customer();
		Customer c3=new Customer();
		c1.input();
		c2.input();
		c3.input();
		System.out.println("*********************************");
		c1.show();
		c2.show();
		c3.show();
	}

}
