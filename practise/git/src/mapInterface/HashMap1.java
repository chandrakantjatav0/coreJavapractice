package mapInterface;

import java.util.*;

public class HashMap1 {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Mango");
		map.put(2, "Banana");
		map.put(3, "Grapes");
		map.put(4, "Apple");
		System.out.println("#Iterating HashMap....");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		System.out.println("#Adding one more object....");
		map.put(5, "Kiwi");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(6, "Poemagranate");
		map1.putAll(map);
		System.out.println("#After Adding putAll() Method");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		map1.replace(2, "Banana", "Papaya");
		System.out.println("#After replacing one Object : " + "\n" + map1);

		map1.clone();
		System.out.println("#After putting clone()  Method");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	
		map1.clear();
		System.out.println("#After clear all the object : " + map1);
	}
}
