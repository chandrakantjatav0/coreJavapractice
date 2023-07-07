package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Test4 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Chandrakant");
		list.add("Charlie");
		list.add("Chandu");
		list.add("Pintu");
		System.out.println(" *Traversing List Through List Iterator " + "\n" + list);
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println(" *Traversing List Through For loop");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
