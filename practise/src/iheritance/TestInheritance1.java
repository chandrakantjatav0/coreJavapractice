///Single Inheritance
package iheritance;

class Teacher {
	
	void Teach() {
		System.out.println("Teacher Teaching well....");
	}
}

class Student extends Teacher {
	void learn() {
		System.out.println("Students Learning....");
	}
}

public class TestInheritance1 {
	public static void main(String[] args) {
		Student T = new Student();
		T.Teach();
		T.learn();
		
	}
}
