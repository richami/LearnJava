// imp example of blank final variable
// In real word every student will have his own unique pancard number which can not be changed once initialized

package finalKeyword;
class Student1
{
	int rollno;
	String name;
	final String pancard; // blank/uninitialized final variable
	Student1(int r,String n,String p)
	{
		rollno=r;
		name=n;
		pancard=p; // its necessary to initialize blank final var in constructor
	}
	public void show()
	{
		System.out.println(rollno+"\t"+name+"\t"+pancard);
	}
}
public class StudentDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s1=new Student1(1,"Rahul","AZX123");
		s1.show();
		Student1 s2=new Student1(2,"Archit","ABC098");
		s2.show();
	}

}
