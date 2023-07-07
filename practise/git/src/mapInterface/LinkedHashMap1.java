package mapInterface;

import java.util.*;

public class LinkedHashMap1 {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(1, "Mango");
		map.put(2, "Banana");
		map.put(null, "Grapes");
		map.put(4, "Apple");
		System.out.println("#Iterating LinkedHashMap....");
		System.out.println("LinkedHashMap" + map.keySet());
		System.out.println("LinkedHashMap Values" + map.values());
		System.out.println("LinkedHashMap Key & Values:" + "\n" + map.entrySet());
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
