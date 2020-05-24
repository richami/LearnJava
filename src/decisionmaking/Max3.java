package decisionmaking;

import java.util.Scanner;

// multiple if stmts
public class Max3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int max=a;
		if(b>max)
			max=b;
		if(c>max)
			max=c;
		System.out.println(max+" is maximum no");
	}

}
