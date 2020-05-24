package operators;

public class Prefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("PREFIX Decrement");
		int a=10;
		System.out.println("a: "+a);
		int b=--a;   //first change(a is dec) then use(dec value is given to b)
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("************************************");
		System.out.println("PREFIX Increment");
		int x=20;
		System.out.println("x: "+x);
		int y=++x;
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		
	}

}
