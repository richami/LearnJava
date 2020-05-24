//Design calculator
package dowhileLoop;

import java.util.Scanner;

public class Calculator11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int ch=5,a,b,r=0;
		do
		{
			System.out.println("Enter 1 to add");
			System.out.println("Enter 2 to sub");
			System.out.println("Enter 3 to mul");
			System.out.println("Enter 4 to div");
			System.out.println("Enter 0 to exit");
			ch=sc.nextInt();
			System.out.println("Enter two numbers: ");
			a=sc.nextInt();
			b=sc.nextInt();
			switch(ch)
			{
			case 1:r=a+b;
					break;
			case 2:r=a-b;
					break;
			case 3:r=a*b;
					break;
			case 4:r=a/b;
					break;
			default:System.out.println("Invalid input");
			}//End of switch
			System.out.println("Result: "+r);
		}while(ch!=0);
		
	}

}
