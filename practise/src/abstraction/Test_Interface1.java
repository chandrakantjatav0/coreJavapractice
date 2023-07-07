package abstraction;

interface Square1 {
	void print();
}

interface Circle1 {
	void show();
}

class Shape1 implements Square1, Circle1 {
	public void print() {
		System.out.println("BOX");
	}

	public void show() {
		System.out.println("WHEEL");
	}
}

public class Test_Interface1 {
	public static void main(String[] args) {
		Shape1 sp = new Shape1();
		sp.print();
		sp.show();
	}

}
