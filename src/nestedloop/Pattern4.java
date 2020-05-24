/*			1 2 3 4 5
 row1		* * * * *
 row2		* * * * *
 row3		* * * * *
 row4		* * * * *
 row5		* * * * *
 */
package nestedloop;
public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) //outer loop (rows)
		{
			for(int j=1;j<=5;j++) //inner loop (columns)
			{
				System.out.print("* ");
			}//end of j loop
			System.out.println();
		}//end of i loop
	}//end of main
}//end of class
//Printing pattern
/* i		i<=5		j
 	1		T			1
 						2
 						3
 						4
 						5
 	2					1
 						2
 						3
 						4
 						5
 	3					1
 						2
 						3
 						4
 						5
 	4
 	5
 */







