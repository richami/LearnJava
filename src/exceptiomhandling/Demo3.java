// Null pointer exception
package exceptiomhandling;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=null;
		try
		{
		System.out.println(s.length());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("End of program");
	}

}
