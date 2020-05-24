/*
 extends is a keyword used in inheritance
 Parent class can not access the child class properties and behavior
 child class can access the parent class properties and behavior
 */
package inheritance;
class Person   // Super class/ Parent class
{
	String name;
	int age;
	public void input(String n, int a)
	{
		name=n; // initialization of instance variable
		age=a;
	}
	public void show()
	{
		System.out.println(name+"\t"+age);
	}
}
class Employee extends Person  // Employee is a child class/sub/derived/extended
{
	int salary;
	String designation;
	public void inputEmp(int s, String d)
	{
		salary=s;
		designation=d;
	}
	public void showEmp()
	{
		System.out.println(salary+"\t"+designation);
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Person p1=new Person();
		//p1.input(" ", 10);
		//p1.show();
		// p1.inputEmp(); parent class can not access the child class method
		Employee e1=new Employee();
		e1.input("Rahul", 30);
		e1.inputEmp(50000, "Test Architech");
		e1.show();
		e1.showEmp();
	}

}
