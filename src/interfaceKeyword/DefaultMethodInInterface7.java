package interfaceKeyword;
interface Drawable2
{
	abstract public void draw();
	default void msg()
	{
		System.out.println("default method");
	}
}
class I implements Drawable2
{
	public void draw()
	{
		System.out.println("drawing");
	}
	 public void msg()
	{
		System.out.println("Override default method");
	}
}
public class DefaultMethodInInterface7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawable2 ob=new I();
		ob.draw();
		ob.msg();
	}

}
