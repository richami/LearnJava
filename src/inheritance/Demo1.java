/*
 Inheritance is a mechnism through which one class accquires the properties
 of another class
 */
package inheritance;
class Animal // parent/Super
{
	public void feature()
	{
		System.out.println("four legs");
	}
	
}
class Cat extends Animal // Cat is a child class/sub/derived
{
	public void sound()
	{
		System.out.println("meeeowwwww");
	}
}
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c=new Cat();
		c.feature();
		c.sound();
	}

}
