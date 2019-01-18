package CollectionFrameworkAll;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class ComparingByValueDescending {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(203, "Rikta");
		map.put(204, "Amit");
		map.put(103, "Shila");
		map.put(202, "Vijay");
		map.put(205, "Rahul");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);

	}

}
