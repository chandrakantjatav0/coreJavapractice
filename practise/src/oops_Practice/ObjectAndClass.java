package oops_Practice;

class Student3 {
	int id;              // Initialising through refrence
	String name;

}

public class ObjectAndClass {
	public static void main(String[] args) {
		Student3 s1 = new Student3();
		s1.id = 101;
		s1.name = "chandrakant";
		System.out.println(s1.id + " " + s1.name);

	}

}
