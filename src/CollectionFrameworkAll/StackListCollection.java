package CollectionFrameworkAll;

import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

public class StackListCollection {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("Tamanna");
		stack.push("Toni");
		stack.push("Rita");
		stack.push("Fahima");
		stack.push("Nilima");
		stack.push("Orpita");

		Iterator<String> itr = stack.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
