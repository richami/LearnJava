/*
 if one class contains more than one constructor but with different argument 
 it is known as constructor overloading
 */
package constructors;
class Train
{
	int tno; //Declare instance variable
	String tname;
	Train()
	{
		System.out.println("Default Constructor");
	}
	Train(int no, String name)
	{
		tno=no; // initiazation of instance variable
		tname=name;
		System.out.println("Parametrized constructor with two arg");
	}
	Train(int no)
	{
		tno=no;
		System.out.println("Paramerized constructor with 1 arg");
	}
	public void display()
	{
		System.out.println(tno+"\t"+tname);
	}
	
}
public class ConstructorOverloading3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Train t3=new Train(102);
		Train t1=new Train();
		Train t2=new Train(101,"Rajdhani");
		t3.display();
		t1.display();
		t2.display();
	}

}
