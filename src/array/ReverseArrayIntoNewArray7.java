//WAP to create another array which stores reverse of existing array
package array;
import java.util.*;
public class ReverseArrayIntoNewArray7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int e[]=new int[5]; // existing array
		int n[]=new int[5]; // n stores reverse of array e
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements: ");
		for(int i=0;i<e.length;i++)
				e[i]=sc.nextInt();
		
		for(int i=4,j=0;(i>=0 && j<n.length);i--,j++)
		{
			n[j]=e[i];  // 4 0    3 1  2 2  13 04
		}
		System.out.println("**************");
		for(int j=0;j<n.length;j++)
		{
			System.out.println(n[j]);
		}
	}

}
