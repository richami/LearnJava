//initiazation of object through reference
package classAndObjects; // package is a collection of classes and interfaces

public class Student {
	int rollno; // instance variables
	String name; // instance variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(); // s1 is the name of the object of class Student class
		s1.rollno=1; // initiazation of object through reference
		s1.name="Rahul";
		System.out.println(s1.rollno);
		System.out.println(s1.name);

	}

}
