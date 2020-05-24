package collectionsinjava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create a List
		List<String> x=new ArrayList<String>();
		// Adding values to the List
		x.add("Archit");
		x.add("Rahul");
		x.add("Archit");
		x.add("Richa");
		x.add("Amit");
		// Find the size of list
		int s=x.size();
		System.out.println("Total no of elements in the list: "+s);
		// Print List elements
		for(String t:x)
		{
			System.out.println(t);
		}
		System.out.println("*******************************");
		Iterator<String> it=x.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
