package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

						//User-defined class objects in Java ArrayList
class Fruit {
	int no;
	String name;

	Fruit(int no, String name) {
		this.no = no;
		this.name = name;
	}
}

public class Test3 {

	public static void main(String[] args) {
		Fruit f1 = new Fruit(1, "Mango");
		Fruit f2 = new Fruit(2, "Papaya");
		Fruit f3 = new Fruit(3, "Kiwi");
		Fruit f4 = new Fruit(4, "Orange");
		ArrayList<Fruit> list = new ArrayList<Fruit>();
		list.add(f1);
		list.add(f2);
		list.add(f3);
		list.add(f4);
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			Fruit ft = (Fruit) itr.next();
			System.out.println(ft.no + " : " + ft.name);
		}
	}
}
