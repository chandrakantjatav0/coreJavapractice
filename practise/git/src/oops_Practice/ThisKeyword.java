package oops_Practice;

class Employeee {
	int id;
	String name;
	float Salary;

	Employeee(int id, String name, float Salary) {
		this.id = id;
		this.name = name;
		this.Salary = Salary;
	}

	void display() {
		System.out.println(id + " " + name + " " + Salary);
	}
}

public class ThisKeyword {
	public static void main(String[] args) {
		Employeee e1 = new Employeee(11, "asd", 3200.5f);
		Employeee e2 = new Employeee(12, "dfg", 4500.0f);
		e1.display();
		e2.display();

	}

}
