/* WAP to find factorial of a no:
 * 5     5*4*3*2*1=120
 *  Row  				column count
 	5	5 4 3 2 1		5
 	4	5 4 3 2			4
 	3	5 4 3			3
 	2	5 4				2
 	1	5				1
 */
package nestedloop;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
