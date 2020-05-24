//Find Max between two no
/* Ternary operator
 * syntax
 * (condition)?true:false;
 */
package basics;
import java.util.Scanner;
public class TernaryOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter two no: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int max=(a>b)?a:b;
		System.out.println("Max: "+max);
		//String msg=(a>b)?"a":"b";
		//System.out.println(msg);

	}

}
