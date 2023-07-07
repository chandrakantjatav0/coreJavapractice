package exception;

import java.io.InvalidClassException;

class InvalidAgeException extends Exception {
	public InvalidAgeException(String str) {
		super(str);
	}
}

public class CustomException_Test1 {
	static void Validate(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("Age is not valid to Vote");
		} else {
			System.out.println("Welcome.. Your Age is Valid");
		}
	}

	public static void main(String[] args) {
		try {
			Validate(15);
		} catch (InvalidAgeException iae) {
			System.out.println("Caught the Exception");
			System.out.println("Exception occured : " + iae);
		}
		System.out.println("Rest of the Code");
	}

}
