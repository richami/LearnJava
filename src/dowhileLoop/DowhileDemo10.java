/* do while is a exit controlled loop
 * here condition is checked after loop is executed
 * stmts inside the loops executed atleast once
 * use it  for menu driven program
 * initiation
 * do
 * {
 *   body of loop
 *   inc/dec;
 * }while(condition);
 */
package dowhileLoop;

public class DowhileDemo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		do
		{
			System.out.println(i);
			i++;
		}while(i<0);
	}

}
