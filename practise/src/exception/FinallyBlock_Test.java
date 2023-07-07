package exception;

public class FinallyBlock_Test {
	public static void main(String[] args) {
//		try {
//			int data = 25 / 5;
//			System.out.println(data);
//		} catch (NullPointerException e) {
//			System.out.println(e);
//		} finally {
//			System.out.println("Finally Block is always Executed");
//		}
//		System.out.println("Rest of the  code print");

		// *****************************************//
		// When an exception occurr but not handled by the catch block
//		try {
//			System.out.println("Inside the try block");
//			int data = 25 / 0;
//			System.out.println(data);
//		} catch (NullPointerException e) {
//			System.out.println(e);
//		} finally {
//			System.out.println("Finally block is Always Executed");
//		}
//		System.out.println("Rest of the code");

		// ****************************************************************//

		// when an Exception Occurs and Handled by the catch Block
		try {
			System.out.println("Inside the try block");
			int data = 25 / 0;
			System.out.println(data);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} finally {
			System.out.println("Fianlly Block is always Executed");
		}
		System.out.println("Rest of the code");
	}
}
