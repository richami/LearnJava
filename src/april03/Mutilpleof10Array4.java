//WAP to input an array of 5 int elements and dsiplay elements which are multiple of 10
package april03;
import java.util.*;
public class Mutilpleof10Array4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter elements: ");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		System.out.println("*********************");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%10==0)
				System.out.println(a[i]);
		}
		/*
		System.out.println("********************");
		for(int x:a)
		{
			if(x%10==0)
				System.out.println(x);
		}*/
	}

}
