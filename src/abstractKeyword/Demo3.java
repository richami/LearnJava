package abstractKeyword;
class Bike1
{
	public void run()
	{
		System.out.println("Bike running");
	}
}
class Honda1 extends Bike1
{
	public void run()
	{
		System.out.println("Honda Bike running safely");
		super.run();
	}
	public void fun()
	{
		System.out.println("Inside fun");
	}
}
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Honda1 b=new Honda1();
		b.run();
		b.fun();
	}

}
