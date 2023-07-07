package linkedHashSet;

import java.util.*;

public class Test2 {
	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("I");
		lhs.add("Want");
		lhs.add("to");
		lhs.add("Become a");
		lhs.add("Software Developer");
		System.out.println("The LinkedHashSet" + lhs);
		Iterator itr = lhs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(lhs.remove("Want"));
		System.out.println("After removing the Hashset Element : " + lhs);
		System.out.println(lhs.remove("will"));
	}
}
