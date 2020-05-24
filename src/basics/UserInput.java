//WAP to add two number, take input from user
package basics;
import java.util.Scanner;
public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		/* how to create an object of a class
		 * className objname=new className(arg);
		 * eg Scanner sc=new Scanner(System.in);
		 */
		int a,b;
		System.out.println("Enter two numbers: ");
		a=sc.nextInt();
		b=sc.nextInt();
		int sum=a+b;
		System.out.println("Addition of two number: "+sum);
	}

}
