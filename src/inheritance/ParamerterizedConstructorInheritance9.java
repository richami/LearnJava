package inheritance;
class PersonX
{
	String name;
	int age;
	PersonX(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
}
class EmployeeY extends PersonX
{
	String designation;
	int salary;
	//when parent class has parameterized constructor
	//then it is the responsibility of child class constructor to
	// provide values and call base class constyructor
	EmployeeY(String name,int age,String designation,int salary)
	{
		super(name,age); // here parent class constructor is invoke with two values i.e name and age
		this.designation=designation;
		this.salary=salary;
	}
	public void show()
	{
		System.out.println(name+"\t"+age+"\t"+designation+"\t"+salary);
	}
}
public class ParamerterizedConstructorInheritance9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeY e1=new EmployeeY("Rahul",30,"Test Architect",50000);
		e1.show();
	}

}
