package abstractKeyword;
abstract class Bike2
{
	abstract public void run();
	
}
class Honda2 extends Bike2
{
	public void fun()
	{
		System.out.println("Inside fun");
	}
	@Override
	public void run() 
	{
		System.out.println("Honda Bike running");
	}
}
public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Honda2 b=new Honda2(); // object creation
		b.run(); // method calling
		b.fun();
	}

}
