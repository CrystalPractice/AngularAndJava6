package CollectionFrameworkAll;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {

		  Map map=new HashMap();
          map.put(1,"Jibon");
          map.put(5,"Dip");  
          map.put(2,"Jai");  
          map.put(2,"Rao");
          map.put(1,"Fida");
          map.put(7,"Fida");
          
          //Traversing Map  
          Set set=map.entrySet();                       //Converting to Set so that we can traverse  
          Iterator itr=set.iterator();
          while(itr.hasNext()){          	  
          	Map.Entry entry=(Map.Entry)itr.next();      //Converting to Map.Entry so that we can get key and value separately
          	System.out.println(entry.getKey()+" "+entry.getValue());  
         }

	}

}
