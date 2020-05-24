/*
 Create the class Emp with the instance variable as
 		id		name	salary
 	define 2 methods
 	readData()		displayData()
 	Create another class Employee3 with main method and create objects 
 	of Emp class and call its methods.
 */
package classAndObjects;
class Emp
{
	int id,salary;
	String name;
	public void readData(int id,int salary,String name)// i, s, n formal argument
	{
		//to distinguish between instance variable name &
		// local variable name we use this keyword
		this.id=id;
		this.salary=salary;
		this.name=name;
	}
	public void display()
	{
		System.out.println(id+"\t"+salary+"\t"+name);
	}
}

public class Employee3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e=new Emp();
		e.readData(101, 50000, "Rahul"); // 101, 50000, "Rahul" Actual Argument
		System.out.println("id\tsalary\tname"); // for display purpose
		e.display();
		Emp e1=new Emp();
		e1.readData(102, 45000, "Archit");
		e1.display();
	}

}
