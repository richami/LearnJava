/*	Row							column count
 	1	*						1
 	2	* *						2
 	3	* * *					3
 	4	* * * *					4
 	5	* * * * *				5
 */
package nestedloop;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
