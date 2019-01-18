package CollectionFrameworkAll;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListCollection {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>(); // Creating arraylist
		list.add("Tamanna");
		list.add("Toni");
		list.add("Rita");
		list.add("80");
		list.add("Nilima");
		list.add("60");

		// Traversing list through Iterator
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
