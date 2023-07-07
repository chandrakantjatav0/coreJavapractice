package linkedlist;

import java.util.LinkedList;

class Student {
	int rollno;
	String name, address;

	public Student(int rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
}

public class Test4 {
	public static void main(String[] args) {
		LinkedList<Student> list = new LinkedList<Student>();
		Student s1 = new Student(01, "Chandrakant jatav", "Dombivli");
		Student s2 = new Student(02, "Sushma Yadav", "Airoli");
		Student s3 = new Student(03, "Vivek Jaiswal", "Kalyan");
		Student s4 = new Student(04, "Aditya Jamdare", "Vangani");
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		for (Student s : list) {
			System.out.println(s.rollno + " " + s.name + " " + s.address);
		}
	}
}
