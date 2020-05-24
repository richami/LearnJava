// WAP to print 1 2 3....10 and stop when value is 5
package infiniteloops;

public class BreakDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<10;i++)
		{
			if(i==5)
				break; // come out of the loop
			System.out.println(i);
		} // end of for loop
	} //End of main method

}// End of class
