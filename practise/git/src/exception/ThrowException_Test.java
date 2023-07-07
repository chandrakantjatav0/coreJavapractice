package exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

//public class ThrowException_Test {
//	static void validate(int age) {
//		if (age < 18) {
//			throw new ArithmeticException(age + " Person is Not Eligible for Vote!");
//		} else {
//			System.out.println(age + " Person is Eligible for vote ");
//		}
//	}
//
//	public static void main(String[] args) {
//		validate(16);
//		System.out.println("Rest of the code will Print....");
//	}}

// ************************************************************************************
//public class ThrowException_Test{
//	static void method() throws FileNotFoundException {
//		FileReader file = new FileReader("esdghjkljlhgkf");
//		BufferedReader fileinput = new BufferedReader(file);
//		throw new FileNotFoundException();
//	}
//
//	public static void main(String[] args) {
//		try {
//			method();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		System.out.println("Rest of the code....");
//	}}

//*****************************************************************************************
class UserDefinedException extends Exception {
	public UserDefinedException(String str) {
		super(str);
	}

}

public class ThrowException_Test {
	public static void main(String[] args) {
		try {
			throw new UserDefinedException("This is user-defined Function");
		} catch (UserDefinedException ude) {
			System.out.println("Caught the Exception ");
			System.out.println(ude.getMessage());
		}
	}
}