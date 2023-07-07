package mapInterface;

import java.util.*;

public class MapTest1 {
	public static void main(String[] args) {
//*************Non Generic******************************		
		Map m = new HashMap();
		m.put(101, "Chandrakant");
		m.put(102, "Vivek");
		m.put(103, "Sushma");
		m.put(104, "Rohit");
		System.out.println(m);
		Set s = m.entrySet();// Converting to Set so that we can traverse..
		Iterator itr = s.iterator();
		while (itr.hasNext()) {
			Map.Entry en = (Map.Entry) itr.next();
			// Converting to Map.Entry so that we can get key and value separately..
			System.out.println(en.getKey() + " " + en.getValue());

		}
		System.out.println("-----------------------------------");

//*******************Generic***********************
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(null, "ABC");
		map.put(202, "LMNO");
		map.put(203, null);
		map.put(204, null);
		System.out.println(map);
		for (Map.Entry m1 : map.entrySet())// Elements can traverse in any order..
		{
			System.out.println(m1.getKey() + " " + m1.getValue());
		}
		System.out.println("------------------------------------");
//**********************************************************************
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(301, "Harsh");
		map1.put(302, "Ketan");
		map1.put(303, "Kunal");
		map1.put(304, "Harsh");
		System.out.println(map1);
		// Returns a Set view of the mappings contained in this map
		map1.entrySet();
		for (Map.Entry m2 : map1.entrySet())// Elements can traverse in any order..
		{
			System.out.println(m2.getKey() + " " + m2.getValue());
		}

	}

}
