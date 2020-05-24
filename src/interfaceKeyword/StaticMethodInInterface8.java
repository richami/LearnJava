/*
 * we can not override static method
 */
package interfaceKeyword;
interface Drawable3
{
	abstract public void draw();
	static int cube(int n)
	{
		return n*n*n;
	}
}
class Rectangle2 implements Drawable3
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Rectangle");
	}
}
public class StaticMethodInInterface8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawable3 d=new Rectangle2();
		d.draw();
		System.out.println(Drawable3.cube(3));
		// since cube is static method we have to call it using interface Name
	}

}
