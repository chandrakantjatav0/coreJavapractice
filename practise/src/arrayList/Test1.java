package arrayList;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

public class Test1 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		al.add(11);
		al.add(null);
		al.add(13);
		al.add(14);
		System.out.println(al);
		al.remove(1);
		System.out.println(al);
		al.add(1, 12);
		System.out.println(al);
		/**
		 * [11,12,13,14]the square bracket comes coz, syso(al) =
		 * System.out.println(al.toStrings());
		 */
//--------------------------------------------------------------		
		ArrayList l1 = new ArrayList();
		LinkedList l2 = new LinkedList();
		System.out.println(l1 instanceof Serializable);
		System.out.println(l2 instanceof Cloneable);
		System.out.println(l1 instanceof RandomAccess);
		System.out.println(l2 instanceof RandomAccess);
	}
}
