package constructors;
class Student1
{
	int rollno;
	String name;
	
	Student1(int r,String n)
	{
		rollno=r;
		name=n;
	}
	Student1()
	{
		
	}
	Student1(Student1 s1)
	{
		rollno=s1.rollno; // here rollno of object s1 is given to instance var rollno
		name=s1.name;
	}
	public void display()
	{
		System.out.println(rollno+"\t"+name);
	}
}
public class Copy1objectIntoAnother4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s1=new Student1(1,"Rahul");
		Student1 s2=new Student1(s1);
		System.out.println(s2);
		s1.display();
		s2.display();
		Student1 s3=new Student1();
		s3=s1;
		s3.display();
	}

}
