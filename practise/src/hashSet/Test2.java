package hashSet;

import java.util.*;

public class Test2 {
	public static void main(String[] args) {
		HashSet<String> h = new HashSet<String>();
		h.add("Chandrakant");
		h.add("Rohit");
		h.add("Vivek");
		h.add(null);
		h.remove(3);
		h.add("Sushma");
		Iterator itr = h.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(h);
		System.out.println("--------------------------------------------");
		ArrayList ar = new ArrayList();
		ar.add(2);
		ar.add(3);
		ar.add(null);
		ar.add(10);
		Iterator i = ar.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());

		}
		System.out.println("---------------------------------");
		Integer arr[] = { 1, 2, 3, 4, 5 };
		HashSet<Integer> h1 = new HashSet<Integer>(List.of(arr));
		
		Iterator it = h1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
