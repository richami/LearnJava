package superKeyword;
class Animal1
{
	public void eat()
	{
		System.out.println("Eating...");
	}
}
class Dog1 extends Animal1
{
	public void eat()
	{
		//super.eat(); // here Animal1 class eat() will be invoked
		System.out.println("Eating bread...");
		super.eat(); // sequence does't matter
	}
}
public class SuperInMethodOverridding2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog1 d1=new Dog1();
		d1.eat();
	}

}
