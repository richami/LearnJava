//WAP to find Max in an array
package april03;
import java.util.*;
public class MaxInArray2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter the values: ");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		//logic to find max
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		System.out.println("Max: "+max);
	}

}
