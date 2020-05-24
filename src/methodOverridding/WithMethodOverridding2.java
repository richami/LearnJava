package methodOverridding;
class Veh
{
	public void run()
	{
		System.out.println("Vehicle is running");
	}
}
class Car extends Veh
{
	public void run()
	{
		System.out.println("Car is running");
	}
}
public class WithMethodOverridding2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1=new Car();
		c1.run();
	}

}
