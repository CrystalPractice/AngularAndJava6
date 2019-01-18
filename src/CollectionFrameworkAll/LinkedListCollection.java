package CollectionFrameworkAll;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListCollection {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Tamanna");
		list.add("Toni");
		list.add("Rita");
		list.add("Fahima");
		list.add("Nilima");
		list.add("Orpita");
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
