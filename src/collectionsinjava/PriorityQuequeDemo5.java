package collectionsinjava;
import java.util.*;
public class PriorityQuequeDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> pr=new PriorityQueue<String>();
		pr.add("Archit");
		pr.add("Rahul");
		pr.add("Archit");
		pr.add("Rahul");
		pr.add("Richa");
		System.out.println("Head: "+pr.element());
		System.out.println("Head: "+pr.peek());
		System.out.println("Display all elements");
		Iterator<String> it=pr.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		pr.remove(); // remove Archit
		pr.poll(); // remove Rahul
		System.out.println("******************************");
		System.out.println("After removing one elements");
		Iterator<String> itr=pr.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	// P0			p1			p2
	//Archit		Rahul		Richa
	//Archit		Rahul	

}
