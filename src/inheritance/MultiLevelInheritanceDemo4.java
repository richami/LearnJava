/*
 Demo for Multilevel Inheritance
 */
package inheritance;
class Animal1 // GrandFather class
{
	void eat()
	{
		System.out.println("Eating....");
	}
}
class Dog extends Animal1 // Dog class is Father class
{
	public void bark()
	{
		System.out.println("Barking");
	}
}
class BabyDog extends Dog
{
	public void weep()
	{
		System.out.println("Weeping");
	}
}
public class MultiLevelInheritanceDemo4 {
	public static void main(String args[])
	{
		BabyDog d=new BabyDog();
		d.eat();
		d.bark();
		d.weep();
	}

}
