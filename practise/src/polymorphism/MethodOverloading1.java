package polymorphism;

// changing data type of arguments
class B {
	int add() {
		int a = 10, b = 20, c;
		c = a + b;
		return c;
	}

	void add(int x, int y) {
		int c;
		c = x + y;
		System.out.println(c);
	}

	void add(int x, double y) {
		double z;
		z = x + y;
		System.out.println(z);
	}
}

public class MethodOverloading1 {
	public static void main(String[] args) {
		B v = new B();
		v.add(40, 30);
		v.add(30, 20.0);
		int add = v.add();
		System.out.println(add);

	}

}
