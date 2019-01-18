package CollectionFrameworkAll;

import java.util.Vector;

public class VectorListToString {

	public static void main(String[] args) {
		// create default vector of capacity 10
		Vector v = new Vector();

		v.add(1);
		v.add(2);
		v.add("Geeks");
		v.add("forGeeks");
		v.add(4);

		// string equivalent of vector
		System.out.println(" String equivalent of vector: " + v.toString());

	}

}
