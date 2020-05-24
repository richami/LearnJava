//WAP to implement binary search(assumption elements will be either in asc or desc order)
/*  45  56 66  78 	89 	90	 95	 101	  522	550
 	0	1	2	3	4	5	  6	   7		8	9
 	beg=0    end=9    item=101
 		5		 9
 	mid=(beg+end)/2    0+9/2=4
 	mid= (5+9)/2 mid=7
 */
package april03;
import java.util.*;
public class BinarySearch6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		System.out.println("Enter elements: ");
		for(int i=0;i<10;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter element to be searched for: ");
		int item=sc.nextInt();
		//logic for binary search
		int beg=0,end=a.length-1;
		int mid,flag=0;
		while(beg<=end)
		{
			mid=(beg+end)/2;
			if(a[mid]==item)
			{
				flag=1;
				break;
			}
			else if(item>a[mid])
				beg=mid+1;
			else if(item<a[mid])
				end=mid-1;
		}//end of while loop
		if(flag==1)
			System.out.println("Sucessful");
		else
			System.out.println("Unsuccessful");
	}

}
