package linkedHashSet;

import java.util.*;

public class Test1 {

	public static void main(String[] args) {
		LinkedHashSet l = new LinkedHashSet();
		l.add("D");
		l.add("B");
		l.add("k");
		l.add(10);
		l.add("D");
		l.add(null);
		System.out.println(l.add("k"));
		System.out.println(l);
		Iterator itr = l.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
