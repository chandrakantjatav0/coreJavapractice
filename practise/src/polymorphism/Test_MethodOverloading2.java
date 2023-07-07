package polymorphism;

class added {
	void add() {
		int a = 10;
		System.out.println(a);
	}

	void add(int b, int c, int d) {
		b = 20;
		c = 30;
		d = 20 + 30;
		System.out.println(d);
	}

	public void add(int x, int y) {
		x = 15;
		y = 15;
		System.out.println(x + y);
	}
}

public class Test_MethodOverloading2 {
	public static void main(String[] args) {
		added a = new added();
		a.add();
		a.add(20, 30);
		a.add(15, 15);
	}
}
