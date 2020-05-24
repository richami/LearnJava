//WAP to design calculator
/* Syntax of switch
 * switch(exp/var/value)
 * {
 * 	case 1: stmt
 * 			break;
 * case 2: stmt
 * 			break;
 * .
 * .
 * .
 * case N: stmt
 * 			break;
 * default: stmt
 * }
 */
package decisionmaking;

import java.util.Scanner;

public class DemoSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 to add\n Enter 2 to sub\n Enter 3 to mul\n Enter 4 to div");
		int op=sc.nextInt();
		System.out.println("Enter two number: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int r=0; //op=3, a=10, b=3, r=0
		/* using else if
		 if(op==1)
			r=a+b;
		else if(op==2)
			r=a-b;
		else if(op==3)
			r=a*b;
		else if(op==4)
			r=a/b;
		else
			System.out.println("invalid input");
			*/
		switch(op)
		{
		case 1:r=a+b;
				break;
		case 2:r=a-b;
				break;
		case 3:r=a*b; //r=10*3 , r=30
				break; //come out of the switch 
		case 4: r=a/b;
				break;
		default:System.out.println("Invalid input");
		} //end of switch
		System.out.println("result: "+r);

	}

}
