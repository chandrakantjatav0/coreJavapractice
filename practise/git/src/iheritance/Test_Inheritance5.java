package iheritance;

// hierarcial Inheritance
class Father {
	void fam() {
		System.out.println("Baap BAAP hota hai!...");
	}
}

class Son extends Father {
	void beta() {
		System.out.println("Nalla Betaa!..");
	}
}

class Daughter extends Father {
	void daug() {
		System.out.println("Garib Betii!...");
	}
}

public class Test_Inheritance5 {
	public static void main(String[] args) {
		Daughter Dg = new Daughter();
		Dg.fam();
		Dg.daug();
		// Dg.beta();
	}

}
