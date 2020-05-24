package superKeyword;
class Animal
{
	String color="White";
}
class Dog extends Animal
{
	String color="Black"; // here instance var name is same as that of parent class instance var, it overrides the parent class instance var color
	public void display()
	{
		System.out.println(color); // it display color of Dog class
		System.out.println(super.color); // display color of Animal/Parent class
	}
}
public class SuperUsedInSameInstanceVariableName1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1=new Dog();
		d1.display();
	}

}
