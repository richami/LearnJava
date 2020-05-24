//  0 1 1 2 3 5 8 13 21....... n terms
package loops;
import java.util.Scanner;
public class FibonacciSeries {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0, b=1;
		int c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no: ");
		int n=sc.nextInt();
		System.out.print(a+" "+b+" ");
		for(int i=3;i<=n;i++)
		{
					// a b c
			c=a+b;  // 0 1 1 2
					//   a b
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}

}
