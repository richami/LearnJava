//count the no of objects created
package staticKeyword;
class Item1
{
	int ino;
	String iname;
	 static int count=0; // refer CountNoOfObjectswithoutStatic2
	Item1()
	{
		count++;
		System.out.println("no of objects created: "+count);
	}
	public void input(int i, String n)
	{
		ino=i;
		iname=n;
	}
	public void display()
	{
		System.out.println(ino+"\t"+iname);
	}
}
public class CountNoOfObjects3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item1 i1=new Item1();
		Item1 i2=new Item1();
	}

}
