package collectionsinjava;
import java.util.*;
public class VectorDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v=new Vector<String>();
		v.add("Archit");
		v.add("Rahul");
		v.add("Archit");
		v.add("Rahul");
		v.add("Richa");
		Iterator<String> it=v.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
