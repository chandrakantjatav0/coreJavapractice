package iheritance;

//MultiLevel Inheritance
class School {
	void Vidyalay() {
		System.out.println("School is key to teach Students..");
	}
}

class HeadMaster extends School {
	void head() {
		System.out.println("HeadMaster is giving instruction to teacher..");
	}
}

class Teacher1 extends HeadMaster {
	void teach() {
		System.out.println("Teacher teaches to students..");
	}
}

class Students extends Teacher1 {
	void learn() {
		System.out.println("Students learning Java");
	}
}

public class TestInheritance3 {
	public static void main(String[] args) {
		Students st = new Students();
		st.Vidyalay();
		st.head();
		st.teach();
		st.learn();
	}

}