package staticKeyword;

import java.util.Scanner;

class Student
{
	int rollno; // instance variable
	String name; // instance var
	static String clzname="IIT Roorkee"; // class variable(every object of Student class will share this common propery)
	public void display()
	{
		System.out.println(rollno+"\t"+name+"\t"+clzname);
	}
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rollno and name");
		rollno=sc.nextInt();
		name=sc.next();
	}
}
public class StaticVariableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		Student s2=new Student();
		s1.input();
		s2.input();
		s1.display();
		s2.display();
	}

}
