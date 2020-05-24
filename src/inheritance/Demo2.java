package inheritance;
class Rahul
{
	int bankBalance;
	String property;
	public void input(int b,String p)
	{
		bankBalance=b;
		property=p;
	}
	public void show()
	{
		System.out.println(bankBalance+"\t"+property);
	}
}
class Aarav extends Rahul
{
	String car;
	String home;
	public void inputA(String c,String h)
	{
		car=c;
		home=h;
	}
	public void showA()
	{
		
		System.out.println(car+"\t"+home);
	}
}
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aarav a1=new Aarav();
		a1.input(200000, "pearl");
		a1.inputA("Honda", "Villa");
		a1.show();
		a1.showA();
		//Rahul r=new Rahul(); this can only access bankBAlance, Property, input() show()
		
	}

}
