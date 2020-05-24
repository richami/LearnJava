package abstractKeyword;
abstract class Bike
{
	abstract public void run();
}
class Honda extends Bike
{
	public void run()
	{
		System.out.println("Honda Bike is running safely");
	}
}
class Yamaha extends Bike
{
	public void run()
	{
		System.out.println("Yamaha Bike is running safely");
	}
	}
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b=new Honda(); // up-casting
		b.run();
		b=new Yamaha();
		b.run();
		Honda h1=new Honda();
		h1.run();
		Yamaha y1=new Yamaha();
		y1.run();
	}

}
