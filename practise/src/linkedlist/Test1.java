package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class Test1 {
	public static void main(String[] args) {
		LinkedList<String> l1 = new LinkedList<String>();
		l1.add("Chandrakant");
		l1.add("Charlie");
		l1.add(null);
		l1.add("Pintu");
		l1.add(4, null);
		l1.set(2, "Chandu");
		l1.addLast("chagghdha");
		System.out.println("#Initial list of elements : " + "\n" + l1 + "\n");
		Iterator itr = l1.iterator();
		System.out.println("#Iterating the Elements : ");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();
		l1.remove(5);
		System.out.println("#Removing an element : " + "\n" + l1 + "\n");
		l1.set(4, "harsh");
		System.out.println("#Adding an element : " + "\n" + l1 + "\n");
		l1.removeFirst();
		System.out.println("#Removing first element : " + "\n" + l1 + "\n");
		l1.removeLast();
		System.out.println("#Removing Last element : " + "\n" + l1 + "\n");
		l1.removeFirstOccurrence("Charlie");
		System.out.println("#After Invoking removeFirstOccurence()method  element : " + "\n" + l1 + "\n");
		l1.removeLastOccurrence("Pintu");
		System.out.println("#After Invoking removeLastOccurence()method element : " + "\n" + l1 + "\n");
		l1.clear();
		System.out.println("#After invoking the clear() method : "+l1);
//		LinkedList<String>l2 = new LinkedList<String>();
//		l2.addAll(l1);
//		System.out.println("Updating the Element List : "+l2);
		
	}
}
