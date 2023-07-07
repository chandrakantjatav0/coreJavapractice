package oops_Practice;

class Employee2 {
	int id;
	String name;
	Float Salary;

	void insert(int i, String n, float s) {
		id = i;
		name = n;
		Salary = s;
	}

	void display() {
		System.out.println(id + " " + name + " " + Salary);

	}
}

public class TestEmployee1 {

	public static void main(String[] args) {
		Employee2 e1 = new Employee2();
		Employee2 e2 = new Employee2();
		Employee2 e3 = new Employee2();
		e1.insert(101, "Chandrakant Jatav", 32000f);
		e2.insert(102, "Vivek Jaiswal", 30000f);
		e3.insert(103, "Sushma Yadav", 28000f);
		e1.display();
		e2.display();
		e3.display();

	}

}
