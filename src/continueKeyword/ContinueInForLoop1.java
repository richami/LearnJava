//break means come out of the loop
//continue means go to next itlteration and skip the remaining code
package continueKeyword;

public class ContinueInForLoop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				continue; //it skips the remaining code and it inc the value of i by 1 
			}
			System.out.println(i);
		}

	}

}
