package thisDemo;
class A
{
	public void m()
	{
		System.out.println("This is method m");
	}
	public void n()
	{
		this.m(); // or m();
		System.out.println("This is method n");
	}
}
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=new A();
		obj.n();

	}

}
