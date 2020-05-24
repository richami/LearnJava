// 1 4 9 16 25 .... 100
package loops;

public class Series3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
			System.out.print(i*i+" ");
		System.out.println();
		int a=3;
		for(int i=1;i<=100;)
		{
			System.out.print(i+" ");
			i=i+a;
			a=a+2;
		}
	}

}
