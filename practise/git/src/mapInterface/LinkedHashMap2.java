package mapInterface;

import java.util.*;

class Book {
	int id;
	String name, author, publisher;
	int quantity;

	Book(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}

public class LinkedHashMap2 {
	public static void main(String[] args) {
		LinkedHashMap<Integer, Book> hm = new LinkedHashMap<Integer, Book>();
		Book b1 = new Book(1, "KamaSutra", "Vatsayana", "XYZ", 8);
		Book b2 = new Book(2, "Arthashastra", "Kautilya", "ABC", 6);
		Book b3 = new Book(3, "Das Kapital", "Karl Marx", "LMN", 9);
		hm.put(2, b2);
		hm.put(3, b3);
		hm.put(1, b1);
		for (Map.Entry<Integer, Book> entry : hm.entrySet()) {
			int key = entry.getKey();
			Book b = entry.getValue();
			System.out.println(key + " Details:");

			System.out.println(b1.id + " " + b1.name + " " + b1.author + " " + b1.publisher + " " + b1.quantity);
			System.out.println(b2.id + " " + b2.name + " " + b2.author + " " + b2.publisher + " " + b2.quantity);
			System.out.println(b3.id + " " + b3.name + " " + b3.author + " " + b3.publisher + " " + b3.quantity);

		}
	}
}
