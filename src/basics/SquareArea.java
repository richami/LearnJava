package basics;

import java.util.Scanner;

public class SquareArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Double side,area;
		System.out.println("Enter side of a square: ");
		side=sc.nextDouble();
		area=4*side;
		System.out.println("Area of square: "+area);
	}

}
