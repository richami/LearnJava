/*
 class Person
 class Employee extends Person
 class QA extends Employee
 */
package inheritance;
class QA extends Employee
{
	String projectName;
	public void showQA()
	{
		projectName="Freshii";
		System.out.println("Project Name: "+projectName);
	}
}
public class RealWordExampleMultilevelInheritance5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QA q1=new QA();
		q1.input("Rahul", 30); // from person class
		q1.inputEmp(50000, "Test Architech"); // from Employee class
		q1.showEmp(); // from Employee class
		q1.show(); // from Person class
		q1.showQA(); // from QA class
		
	}

}
