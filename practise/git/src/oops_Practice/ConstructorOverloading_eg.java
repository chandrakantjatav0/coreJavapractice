package oops_Practice;

class Student5 {
	int age, a = 20;
	String name, n = "Chandrakant";

	void display() {
		System.out.println(a + " " + n);
	}
}

public class ConstructorOverloading_eg {
	int id;
	String name;
	int age;

	ConstructorOverloading_eg(int i, String n) {
		id = i;
		name = n;
	}

	ConstructorOverloading_eg(int i, String n, int a) {
		id = i;
		name = n;
		age = a;
	} void display() {
		System.out.println(id+" "+name+" "+age+" ");
	}

	public static void main(String[] args) {
     Student5 s1 = new Student5();
     s1.display();
     ConstructorOverloading_eg c1 = new ConstructorOverloading_eg (101,"Chandu");
     ConstructorOverloading_eg c2 = new ConstructorOverloading_eg (102,"charlie",20);
     c1.display();
     c2.display();
	}

}
