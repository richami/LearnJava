// ARithmetic Exception Handling 
package exceptiomhandling;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int c=10/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("End of program");
	}

}
