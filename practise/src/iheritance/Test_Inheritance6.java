package iheritance;

class Eventer {
	void Event() {
		System.out.println("Head of the Event");
	}
}

class Co_ordinator extends Eventer {
	void calling() {
		System.out.println("Arrange promoter for Event");
	}
}

class Promoter extends Eventer {
	void work() {
		System.out.println("Promoter works in Event");
	}
}

public class Test_Inheritance6 {
	public static void main(String[] args) {
		Promoter P = new Promoter();
		P.Event();
		P.work();
//	P.calling();
	}
}
