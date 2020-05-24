//WAP to input an array of 5 elements and display elements at odd position(index)
package april03;
import java.util.*;
public class PrintElementsAtOddPosition {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter elements: ");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		System.out.println("*****************");
		for(int i=1;i<a.length;i=i+2)
			System.out.println(a[i]);
		System.out.println("*****************");
		//option line 16 to 21
		for(int i=0;i<a.length;i++)
		{
			if(i%2!=0) //check index is odd
				System.out.println(a[i]);
		}
	}

}
