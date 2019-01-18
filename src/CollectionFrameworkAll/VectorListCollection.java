package CollectionFrameworkAll;

import java.util.Iterator;
import java.util.Vector;

public class VectorListCollection {

	public static void main(String[] args) {
		Vector<String> vec = new Vector<String>();
		vec.add("Tamanna");
		vec.add("Toni");
		vec.add("Rita");
		vec.add("Fahima");
		vec.add("Nilima");
		vec.add("Orpita");

		Iterator<String> itr = vec.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
