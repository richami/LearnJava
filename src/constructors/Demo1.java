/*
 Constructor is a special method whose name is same as of class name
 Constructor is use to initialise the instance variables when an object is created
 Constructor is called automatically when an object is created
 constructor is use to allocate memory to the object created
 if you have not created any constructor then java compiler
 automatically creates one default constructor for your code
 */
package constructors;
class Student
{
	int rollno;
	String name;
	 Student() // constructor
	{
		rollno=1; // refer line 2
		name="Rahul"; // refer line 2
		System.out.println("Constructor Student");
	}
}
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(); // it will automatically call constructor
		System.out.println(s1.rollno+" "+s1.name);
	}

}
