/* Hierarichal Inheritance
 *  1 parent Drawable
 *  more than 1 child 	Rectangle, Circle
 */
package interfaceKeyword;
interface Drawable
{
	abstract public void draw();
}
class Rectangle implements Drawable
{
	public void draw()
	{
		System.out.println("Rectangle drawn");
	}
}
class Circle implements Drawable
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Circle drawn");
	}
	
}
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawable d=new Rectangle();
		d.draw();
		d=new Circle();
		d.draw();
		
	}

}
