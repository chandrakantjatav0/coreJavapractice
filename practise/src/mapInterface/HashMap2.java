package mapInterface;

import java.util.*;

public class HashMap2 {

	public static void main(String[] args) {
		HashMap<String, Integer> hs = new HashMap<String, Integer>();
		hs.put("Chandrakant", 4000);
		hs.put("Harsh", 2000);
		hs.put("Ketan", 1500);
		hs.put("Kunal", 2500);
		System.out.println(hs);

		hs.put("Shekhar", 3700);
		for (Map.Entry m : hs.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		Set s = hs.keySet();
		System.out.println(s);

		Collection s2 = hs.values();
		System.out.println(s2);

		Set s1 = hs.entrySet();
		System.out.println(s1);
		
		hs.remove("Ketan");
		System.out.println(hs);
		
		Map m1 = Collections.synchronizedMap(hs);
		System.out.println(m1);
	}

}
