package basics;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		float r,area;
		System.out.println("Enter Radius of a circle: ");
		r=sc.nextFloat();
		area=(float) (3.14*r*r);
		System.out.println("Area of circle: "+area);
	}

}
