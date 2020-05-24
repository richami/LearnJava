package collectionsinjava;
import java.util.*;
public class LinkedListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list1=new LinkedList<String>();
		list1.add("Rahul");
		list1.add("Archit");
		list1.add("Rahul");
		list1.add("Richa");
		int size=list1.size();
		System.out.println("Size: "+size);
		// interface<data-type> object=listobject.methodname();
		Iterator<String> it=list1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
