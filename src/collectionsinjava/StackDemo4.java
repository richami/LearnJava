/*
 * Stack: LIFO Last In First Out
 */
package collectionsinjava;
import java.util.*;
public class StackDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack=new Stack<String>();
		stack.add("Archit");
		stack.push("Rahul");
		stack.push("Archit");
		stack.push("Garima");
		System.out.println("Before pop");
		Iterator<String> it=stack.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		stack.pop();
		System.out.println("********************");
		System.out.println("After pop");
		Iterator<String> itr=stack.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		stack.pop();

	}

}
