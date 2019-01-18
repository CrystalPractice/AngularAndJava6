package CollectionFrameworkAll;

import java.util.Vector;

public class VectorListClone {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// create default vector 
        Vector v = new Vector(); 
  
        Vector v_clone = new Vector(); 
        v.add(0, 1); 
        v.add(1, 2); 
        v.add(2, "geeks"); 
        v.add(3, "forGeeks"); 
        v.add(4, 3); 
        System.out.println("Normal v:" +v);
        
        v_clone=(Vector)v.clone();

        // checking vector 
        System.out.println("Clone of v: " + v_clone);
        

	}

}
