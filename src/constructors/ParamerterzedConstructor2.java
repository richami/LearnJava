package constructors;
class Employee
{
	int id;
	String name;
	double salary;
	Employee(int id,String name, double salary) // parametized constructor
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		System.out.println("Parametized constructor");
	}
	public void display()
	{
		System.out.println(id+"\t"+name+"\t"+salary);
	}
}
public class ParamerterzedConstructor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//call parametrized constructor
		Employee e1=new Employee(101,"Rahul",50000); // execute 7-13
		e1.display();
		

	}

}
