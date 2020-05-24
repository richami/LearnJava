package continueKeyword;

public class ContinueInDoWhileLoop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		do
		{
			i++;
			if(i==5)
			{
				continue;
			}
			System.out.println(i);
		}while(i<=10);

	}

}
