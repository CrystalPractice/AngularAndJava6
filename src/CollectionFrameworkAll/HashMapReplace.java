package CollectionFrameworkAll;

import java.util.HashMap;
import java.util.Map;

public class HashMapReplace {

	public static void main(String[] args) {
		HashMap<Integer,String>hm=new HashMap<Integer,String>();
		  hm.put(100,"Amit");    
	      hm.put(101,"Vijay");    
	      hm.put(102,"Rahul"); 
	      hm.put(103, "Nirmol");
		  hm.put(104, "Rikta");
		  hm.put(105, "Vijaya");
		  
		   System.out.println("Initial list of elements:");  
		     for(Map.Entry m:hm.entrySet())  
		     {  
		        System.out.println(m.getKey()+" "+m.getValue());   
		     }  
		     System.out.println("Updated list of elements:");
		     hm.replace(103,"Pori");
		     for(Map.Entry m:hm.entrySet())  
		     {  
		        System.out.println(m.getKey()+" "+m.getValue());   
		     } 
		     System.out.println("Updated list of elements:");
		     hm.replace(105, "Vijaya", "Nila");
		     for(Map.Entry m:hm.entrySet())  
		     {  
		        System.out.println(m.getKey()+" "+m.getValue());   
		     } 
		     System.out.println("Updated list of elements:");
		     hm.replaceAll((k,v)->"Mahi");
		     for(Map.Entry m:hm.entrySet())  
		     {  
		        System.out.println(m.getKey()+" "+m.getValue());   
		     } 
		     

	}

}
