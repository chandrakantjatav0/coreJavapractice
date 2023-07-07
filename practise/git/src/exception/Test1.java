package exception;

public class Test1 {
	public static void main(String[] args) {
		try {
			int data = 100/0;

		} catch (Exception a) {
			System.out.println(a);
		}
		System.out.println("rest of the code... ");
	}

}

