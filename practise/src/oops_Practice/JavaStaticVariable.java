package oops_Practice;

public class JavaStaticVariable {
	int id;
	String name;
	int age;
	static String school = "A.V.M";

	JavaStaticVariable(int i, String n, int a) {
		id = i;
		name = n;
		age = a;
	}

	void display() {
		System.out.println(id + " " + name + " " + age + " " + school);
	}

	public static void main(String[] args) {
		JavaStaticVariable j1 = new JavaStaticVariable(101, "Chandrakant", 20);
		JavaStaticVariable j2 = new JavaStaticVariable(102, "Chandu", 20);
		j1.display();
		j2.display();
	}

}
