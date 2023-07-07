package exception;

class MyCustomException extends Exception {

}

public class CustomException_Test2 {
	public static void main(String[] args) {
		try {
			throw new MyCustomException();

		} catch (MyCustomException mce) {
			System.out.println("Caught My Exception");
			System.out.println(mce.getMessage());
		}
		System.out.println("rest of the code ");
	}
}
