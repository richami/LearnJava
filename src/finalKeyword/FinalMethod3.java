// final methods can not overridden
package finalKeyword;
class Bike
{
	final public void run()
	{
		System.out.println("running.....");
	}
}
class Honda extends Bike
{
	/*public void run()  Compile time error
	{
		System.out.println("Honda bike is running....");
	}*/
}
public class FinalMethod3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Honda h=new Honda();
		h.run(); // here run() is inherited from Bike class
	}

}
