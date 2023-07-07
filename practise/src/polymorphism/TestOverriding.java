package polymorphism;

class Human {
	void Talk() {
		System.out.println("I am a Human");
	}
}

class Employee extends Human {
	void Talk() {
//		super.Talk();
		System.out.println("I am a Employee");
	}
}

class Programmer extends Employee {
	void Talk() {
//		super.Talk();
		System.out.println("I am a Programmer");
	}
}

public class TestOverriding {
	public static void main(String[] args) {
		Human h = new Programmer();
		Human h1 = new Employee();
		h1.Talk();
		h.Talk();
	}

}
