package CollectionFrameworkAll;

import java.util.Vector;

public class VectorListTrimToSize {

	public static void main(String[] args) {
		// create default vector of capacity 10 
        Vector v = new Vector(); 
  
        v.add(1); 
        v.add(2); 
        v.add("Geeks"); 
        v.add("forGeeks"); 
        v.add(4); 
  
        // checking initial capacity 
        System.out.println("Initial capacity: " + v.capacity()); 
        
     // trim capacity to size 
        v.trimToSize(); 
        
     // checking capacity after triming 
        System.out.println("capacity after triming: " + v.capacity()); 

	}

}
