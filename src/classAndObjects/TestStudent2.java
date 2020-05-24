package classAndObjects;
class Stu
{
	int rollno;
	String name;
}

public class TestStudent2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stu s1=new Stu();
		Stu s2=new Stu();
		s1.rollno=2;
		s1.name="Archit";
		s2.rollno=3;
		s2.name="Rahul";
		System.out.println("First Student: "+s1.rollno+" "+s1.name);
		System.out.println("Second Student: "+s2.rollno+" "+s2.name);
		

	}

}
