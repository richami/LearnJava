package continueKeyword;

public class ContinueInWhileLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		while(i<10)
		{
			i++;
			if(i==5)
			{
				continue;
			}
			System.out.println(i);
			
		}

	}

}
