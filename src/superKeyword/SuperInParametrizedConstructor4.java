package superKeyword;
class Person
{
	String name;
	Person()
	{
		
	}
	Person(String n)
	{
		name=n;
	}
}
class Student extends Person
{
	int rollno;
	Student(String n,int r)
	{
		super(n); // compulsury , call parent class constructor
		rollno=r;
	}
	public void display()
	{
		System.out.println(name+"\t"+rollno);
	}
}
public class SuperInParametrizedConstructor4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("Archit",01);
		s1.display();
	}

}
