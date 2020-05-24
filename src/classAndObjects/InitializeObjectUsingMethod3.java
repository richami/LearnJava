package classAndObjects;
class Student3
{
	int rollno; //instance var
	String name; //instance var
	public void readData(int r,String n) // method
	{
		rollno=r;
		name=n;
	}
	public void display() //method
	{
		System.out.println(rollno+"\t"+name);
	}
}

public class InitializeObjectUsingMethod3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student3 s=new Student3();
		s.readData(1, "Rahul");// initiazation through method, calling method
		Student3 s1=new Student3();
		s1.readData(2, "Archit");
		s.display();
		s1.display();
		
	}

}
