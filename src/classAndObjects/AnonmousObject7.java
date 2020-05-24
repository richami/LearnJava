package classAndObjects;
class Factorial
{
	int n;
	public void calFactorial(int n)
	{
		// 5    5*4*3*2*1=120
		this.n=n;
		int f=1;
		for(int i=n;i>=1;i--)
		{
			f=f*i; //1*5*4*3*2*1
		}
		System.out.println("Factorial: "+f);
	}
}

public class AnonmousObject7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// new Factorial() it will create Anonyomous object
		//and it will call calFactorial method
		new Factorial().calFactorial(7);
		new Factorial();//creating anonmous object
	}

}
