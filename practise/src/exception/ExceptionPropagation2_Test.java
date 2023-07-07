package exception;

import java.io.IOException;

public class ExceptionPropagation2_Test {
	void m() {
		System.out.println("Error");
	}

	void n() {
		try {
			m();
		} catch (Exception e) {
			System.out.println("Exception Handled");
		}
		// System.out.println(10 / 0);
	}

	void j() {
//		try {
//			n();
//		} catch (NullPointerException e) {
//			System.out.println("Exception Handle");
//		}System.out.println("Flow move on..");
		n();
	}

	public static void main(String[] args) {
		ExceptionPropagation2_Test ept = new ExceptionPropagation2_Test();
		ept.n();

	}
}
