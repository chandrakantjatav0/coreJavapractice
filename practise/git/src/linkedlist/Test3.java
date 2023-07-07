package linkedlist;

import java.util.*;
import java.util.Iterator;
import java.util.LinkedList;

//Accesdening/descening
public class Test3 {
	public static void main(String[] args) {

		Integer arr[] = { 10, 20, 30, 40, 50 };
		LinkedList<Integer> ll = new LinkedList<Integer>(List.of(arr));
		System.out.println("Ascending order Elements");
		Iterator i1 = ll.iterator();
		while (i1.hasNext())
			System.out.println(i1.next());
		
		System.out.println("Descending Order Elements");
		Iterator i2 = ll.descendingIterator();
		while (i2.hasNext())
			System.out.println(i2.next());

	}

}
//int i = 0;
//while(i<50) {
//	ll.add(i);
//	i=i+10;
//	System.out.println("Decending of the Elements");