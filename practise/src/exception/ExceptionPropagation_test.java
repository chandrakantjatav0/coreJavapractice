package exception;

public class ExceptionPropagation_test {
	void m() {
		int data = 90 / 0;
	}

	void n() {
		m();
	}

	void k() {
		try {
			n();
		} catch (ArithmeticException e) {
			System.out.println("Exception Handeld");
		}
	}

	public static void main(String[] args) {
		ExceptionPropagation_test obj = new ExceptionPropagation_test();
		obj.k();
		System.out.println("Normal flow of code.....");
	}
}
