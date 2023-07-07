package polymorphism;

class Test {
	final int Id1 = 20;

	void hola() {
		System.out.println(Id1);
//		Id1 = 30;
//		System.out.println(Id1);
	}

}

public class FinalKeyword {
	public static void main(String[] args) {
		Test t = new Test();
		t.hola();
	}
}
