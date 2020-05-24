package methodOverloading;
class Add
{
	public void add(int a,long b) //m1
	{
		System.out.println(a+b);
	}
	public void add(int a,int b,int c) //m2
	{
		System.out.println(a+b+c);
	}
}
public class TypePromotion6 {

	public static void main(String[] args) {
		Add a=new Add();
		a.add(20, 20); // invoke m1
		a.add(10, 20,30); // invoke m2
		a.add(20, 'a','b'); // invoke m2 here 'a' to promoted to 97
							// char 'b' is promoted to 98

	}

}
