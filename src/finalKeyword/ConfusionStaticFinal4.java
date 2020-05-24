package finalKeyword;
class Student
{
	int rollno;
	String name;
	final static String clzName="IIT";
	Student(int r, String n)
	{
		rollno=r;
		name=n;
	}
	public void show()
	{
		System.out.println(rollno+"\t"+name+"\t"+clzName);
	}
}
public class ConfusionStaticFinal4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(1,"Archit"), s2=new Student(2,"Rahul");
		s1.show();
		s2.show();
	}

}
