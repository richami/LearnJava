//WAP to input an array of 5 int elements and display it in reverse order
package array;
import java.util.*;
public class PrintReverseArray6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter elements: ");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		System.out.println("************************");
		System.out.println("Reverse of an array: ");
		for(int i=a.length-1;i>=0;i--)
			System.out.println(a[i]);
	}

}
