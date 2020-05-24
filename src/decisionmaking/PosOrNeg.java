//WAP to input a number and check if it is positive or negative
//WAP to marks of 1 subject and give grades according
/* marks		Grade
 * >=85        	A+
 * >=75 && <85	A
 * >=65 && <75	B+
 * >=55 && <65	c+
 * >=40 && <55	C
 * <40			F
 */
package decisionmaking;

import java.util.Scanner;

public class PosOrNeg {

	public static void main(String[] a) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no: ");
		int n=sc.nextInt();
		if(n>0)
			System.out.println("postive");
		else if(n<0)
			System.out.println("Negative");
		else
			System.out.println("Zero");
	}

}
