//WAP to find min in an array using Passing Array to a Method
package april06;

public class PassingArrayToAMethod1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {23,56,78,45,56};
		findMin(a);  //Method Call passed array a to a method findMin
	}// end of main method
	public static void findMin(int p[]) // here p[] can be a[]
	{
		int min=p[0];
		for(int i=0;i<p.length;i++)
		{
			if(p[i]<min)
				min=p[i];
		}// end of for loop
		System.out.println("Min: "+min);
	}// end of findMin method

}// end of class
