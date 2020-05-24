package staticKeyword;

public class StaticBloack6 {
	// static block
	static
	{
		System.out.println("Static block is executed before main");
		int a=10,b=20;
		int c=a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello main");
	}

}
