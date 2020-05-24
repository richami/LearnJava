package exceptiomhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter rollno");
		int rollno=Integer.parseInt(br.readLine());
		System.out.println("Rollno: "+rollno);
		System.out.println("Endofprogram");
	}

}
