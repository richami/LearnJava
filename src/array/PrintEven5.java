//WAP to input an array of 5 int elements and print only even elements
package array;
import java.util.*;
public class PrintEven5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter the elements: ");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		System.out.println("*************************");
		System.out.println("Even elements: ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				System.out.println(a[i]);
		}
	}

}
