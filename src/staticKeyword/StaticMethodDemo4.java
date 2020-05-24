/* use static keyword while declaring a static method
 	we don't need an object to call static methods
 	static methods can be called using className
 	static methods can only access the static variable of a class
 	static methods can not access the non static members of a class
*/
package staticKeyword;
class Employee
{
	int id; // instance var
	String name; // instance
	static String company="IBM"; // class variable/ static var
	public void input(int i, String n) //method
	{
		id=i;
		name=n;
	}
	public void display() // method
	{
		System.out.println(id+"\t"+name+"\t"+company);
	}
	public static void change() // static method
	{
		company="Infosys";
		//System.out.println(id+" "+name); error as id and name are not static
	}
}
public class StaticMethodDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		e1.display();
		Employee.change();
		e1.display();
	}

}
