package methodOverridding;
class Vehicle
{
	public void run()
	{
		System.out.println("Vehichicle is running");
	}
}
class Bike extends Vehicle
{
	
}
public class WithodMethodOverridding1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b1=new Bike();
		b1.run(); // here run() of Vehicle class is called

	}

}
