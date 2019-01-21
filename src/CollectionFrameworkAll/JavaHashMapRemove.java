package CollectionFrameworkAll;

import java.util.HashMap;

public class JavaHashMapRemove {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();          
	      map.put(100,"Amit");    
	      map.put(101,"Vijay");    
	      map.put(102,"Rahul");  
	      map.put(103, "Gaurav");
	      map.put(104,"Tonni");
	      System.out.println("Initial list of elements: "+map); 
	      map.remove(101);                                              //key-based removal  
	      System.out.println("Updated list of elements: "+map);
	      map.remove(102,"Rahul");                                      //key-value pair based removal 
	      System.out.println("Updated list of elements: "+map);
		map.remove(100);                                      //key based removal
		System.out.println("Updated list of elements: "+map);

	}

}
