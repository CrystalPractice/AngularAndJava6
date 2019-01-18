package CollectionFrameworkAll;

import java.util.Vector;

public class VectorListLastIndexOf {

	public static void main(String[] args) {
		// create default vector of capacity 10 
        Vector v = new Vector(); 
  
        v.add(7); 
        v.add(2); 
        v.add("Geeks"); 
        v.add("forGeeks"); 
        v.add(4);
     // checking last occurance of 2 
        System.out.println("last occurance of 2 is: " + v.lastIndexOf(2)); 

	}

}
