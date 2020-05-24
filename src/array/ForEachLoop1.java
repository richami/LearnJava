//Display the content of an array using for each loop
package array;

public class ForEachLoop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,3,5,7,9};
		for( int x:a) //for each loop x will take one by one all the elements present in array
			System.out.println(x);// here x will take 1 then 3 then 5 & so on
		/* for(int i=0;i<a.length;i++) same task done using for loop
			System.out.println(a[i]);
			*/
	}

}
