//WAP to input an array of 5 int elements and display their sum
// 1 3 5 0 8     sum=17
package array;
import java.util.*;
public class SumofElementsInArray4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5]; //declaration of an array
		int sum=0; //initialization of sum var
		System.out.println("Enter elements in an array: ");
		for(int i=0;i<a.length;i++)  //loop to take multiple input values and store them into array
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) // loop is to find the sum of all elements in an array
			sum=sum+a[i];
		System.out.println("Sum: "+sum); //print the sum
	}

}
