//WAP to demonstrate postfix operator
package operators;

public class Postfix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* int a=10;
		 * int b=a++; postfix
		 * first value of a is given to b
		 * then a is incremented
		 * y=10 and a=11     
		 * a++ = a+1
		 */
		System.out.println("POSTFIX INCREMENT");
		int a=10;
		System.out.println("a: "+a);
		int b=a++;
		System.out.println("b: "+b);
		System.out.println("a: "+a);
		System.out.println("**************************************");
		System.out.println("POSTFIX DECREMENT");
		int x=20;
		System.out.println("x: "+x);
		int y=x--;  //first value of x is given to y then x is dec by 1
		System.out.println("x: "+x);
		System.out.println("y: "+y);

	}

}
