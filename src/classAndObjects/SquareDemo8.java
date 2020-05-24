package classAndObjects;
class Square
{
	public void findSquare(int n)
	{
		System.out.println(n*n);
	}
}
public class SquareDemo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Square().findSquare(6);
		Square s1=new Square(),s2=new Square();
		s1.findSquare(10);
		s2.findSquare(25);

	}

}
