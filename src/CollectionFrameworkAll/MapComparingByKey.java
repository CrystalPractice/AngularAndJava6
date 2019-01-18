package CollectionFrameworkAll;

import java.util.HashMap;
import java.util.Map;

public class MapComparingByKey {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(203, "Rikta");
		map.put(204, "Amit");
		map.put(103, "Shila");
		map.put(202, "Vijay");
		map.put(205, "Rahul");

		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

		System.out.println("...................Again With Comments out........................");
		// Returns a Set view of the mappings contained in this map
		map.entrySet()
				// Returns a sequential Stream with this collection as its source
				.stream()
				// Sorted according to the provided Comparator
				.sorted(Map.Entry.comparingByKey())
				// Performs an action for each element of this stream
				.forEach(System.out::println);

	}

}
