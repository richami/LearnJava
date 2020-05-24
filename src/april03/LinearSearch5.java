//WAP to input 5 elements in an array search a particular element
package april03;
import java.util.*;
public class LinearSearch5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter elements in an array: ");
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		System.out.println("Enter the element to be searched: ");
		int item=sc.nextInt();
		//logic to search an item
		int flag=0,i;
		for(i=0;i<a.length;i++)
		{
			if(a[i]==item)
			{
				flag=1;
				break;
			}
		}//end of for loop
		if(flag==1)
			System.out.println("element is present at location "+i);
		else
			System.out.println("element is not present");
	}

}
