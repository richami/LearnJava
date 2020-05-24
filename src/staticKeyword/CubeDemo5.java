package staticKeyword;
class Calculate
{
	public static int cube(int n) // here int is the return type
	{
		return n*n*n;
	}
}
public class CubeDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=Calculate.cube(5);
		System.out.println(r);
		System.out.println(Calculate.cube(5));
	
	}

}
