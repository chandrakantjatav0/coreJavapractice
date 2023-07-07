package mapInterface;

import java.util.*;

public class TreeMap1 {
	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(103, "LLOYED");
		map.put(104, "Hitachi");
		map.put(102, "Voltus");
		map.put(101, "Carrier");
		// map.put("kkk","NNN");//compile time error when put string value in key ...
		// =map.put(null,"NNN");//nulltimeException when we put null in key...
		map.put(107, null);// we can put null in values

		System.out.println(map);
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());

		}
		map.remove(107);
		System.out.println(map);
		System.out.println(map.put(105, "Haier") + map);
		
		//navigable example
		System.out.println("Descinding order" + map.descendingMap());
		
		// Returns key-value pairs whose keys are less than or equal to the specifiedkey.
		System.out.println("HeadMap" + map.headMap(103));
		
		// Returns key-value pairs whose keys are greater than or equal to the specifiedkey.
		System.out.println("Tailmap" + map.tailMap(103));
		
		 //Returns key-value pairs exists in between the specified key.  
		System.out.println("subMap"+map.subMap(100, false,103 ,true));
		
	}
}
