package thisDemo;
class Student
{
	int rollno;
	String name,course;
	double fees;
	Student(int rollno,String name,String course)
	{
		this.rollno=rollno;
		this.name=name;
		this.course=course;
	}
	Student(int rollno,String name,String course,double fees)
	{
		this(rollno,name,course); // line 7-12
		this.fees=fees;
	}
	public void display()
	{
		System.out.println(rollno+" "+name+" "+course+" "+fees);
	}
}
public class RealUsage3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(1,"Rahul","Java",5000);// line 13->7-12 then 16 finally 28
		s1.display();
	}

}
