//WAP to declare and initialize the int array and print its elements
package array;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5]; //Declare an array
		a[0]=10;  //Initialzation
		a[1]=20;
		a[2]=30;
		a[3]=67;
		a[4]=78;
		// line 15 to line 18 is to print the array
		for(int i=0;i<5;i++) //i is used for array index and array index starts with 0
		{
			System.out.println(a[i]);
		}
		// a[0] it means value present at 0 index
		//a[3] it means value present at 3rd index
	}

}
