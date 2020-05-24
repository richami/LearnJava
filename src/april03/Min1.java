//WAP to input an array from user and display the min number from it
package april03;
import java.util.Scanner;
public class Min1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double a[]=new double[5];
		System.out.println("Enter elements: ");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextDouble();
		//logic to find min
		double min=a[0];
		for(double x:a)// For each loop
		{
			if(x<min)
				min=x;
		}
		System.out.println("Min: "+min);
	}

}
