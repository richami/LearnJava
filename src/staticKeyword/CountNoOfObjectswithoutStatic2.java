//count the no of objects created
package staticKeyword;
class Item
{
	int ino;
	String iname;
	 int count=0;
	Item()
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
public class CountNoOfObjectswithoutStatic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item i1=new Item();
		Item i2=new Item();
	}

}
