/*
 Can we overload main method?
 yes
 */
package methodOverloading;

public class OverloadingMainMethod5 {

	public static void main(String[] args) { //m1
		// TODO Auto-generated method stub
		System.out.println("main method with String args[]");
		main("Rahul");
		main();
		int a[]= {1,2,3};
		main(a);  // invoke m4
		input();
	}
	public static void main(String args) // m2
	{
		System.out.println("Main method with String agrs");
	}
	public static void main() //m3
	{
		System.out.println("main method with no argument");
	}
	public static void main(int a[]) //m4
	{
		System.out.println("Main method with integer array");
	}
	public static void input() //m5
	{
		System.out.println("input");
	}
}
