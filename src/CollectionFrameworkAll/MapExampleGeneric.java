package CollectionFrameworkAll;

import java.util.HashMap;
import java.util.Map;

public class MapExampleGeneric {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1001, "Rita");
		map.put(1002, "Rinu");
		map.put(1003, "Rima");
		map.put(1004, "Reshma");
		
		//Elements can traverse in any order  
		for(Map.Entry m:map.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
