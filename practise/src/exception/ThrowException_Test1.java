package exception;

public class ThrowException_Test1 {
	void div(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException(); // throw the explicity
		} else {
			int c = a / b;
			System.out.println(c);

		}
	}

	public static void main(String[] args) {
		ThrowException_Test1 tet = new ThrowException_Test1();
		try {
			tet.div(50, 0); // can't divide by 0...
		} catch (ArithmeticException e) {
			System.out.println(e);
			//e.printStackTrace();     // gives complete information on error
			System.out.println("can't divide by 0...");
		}
	}
}
