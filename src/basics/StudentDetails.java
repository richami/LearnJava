//WAP to input student details like rollno, name. phone number and address
package basics;

import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int rollno;
		String name,phone,address;
		System.out.println("Enter rollno,name, phone and address: ");
		rollno=sc.nextInt();
		name=sc.next();
		phone=sc.next();
		address=sc.next();
		System.out.println("******************************");
		System.out.println("Name: "+name);
		System.out.println("Phone number: "+phone);
		System.out.println("******************************");
		//String s1="Richa",s2="Mittal";
		//System.out.println(s1+" "+s2);
		
	}

}
