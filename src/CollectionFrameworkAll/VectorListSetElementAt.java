package CollectionFrameworkAll;

import java.util.Vector;

public class VectorListSetElementAt {

	public static void main(String[] args) {
		// create default vector of capacity 10 
        Vector v = new Vector(); 
  
        v.add(1); 
        v.add(9); 
        v.add("Geeks"); 
        v.add("forGeeks"); 
        v.add(4);
     // set 4 at the place of 2 
        System.out.println("First vector: "+v);
        v.setElementAt(4, 1); 
        v.setElementAt("Rita", 3); 
        v.setElementAt(7, 2); 
  
        System.out.println("vector: " + v); 

	}

}
