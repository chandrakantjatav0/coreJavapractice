package hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Test1 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();// Non generic object
		hs.add("X");
		hs.add("Y");
		hs.add("Z");
		hs.add("fghjk");
		hs.add(null);
		hs.add("qwerty");
		System.out.println(hs.add("Y"));// duplicate value
		System.out.println(hs);
		Iterator itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
