//odd or even
package exception;

class OddException extends Exception {
	OddException(String message , int a) {
		System.out.println(message);
		System.out.println("Invalid Number is/are : "+ a );
	}
}

public class CustomException_Test3 {
	public static void main(String[] args) {
		Integer n[] = new Integer[5];
		int j = 0  ;
		for (int i = 0; i < 5; i++) {
			try {
				n[i] = Integer.valueOf(args[i]);
				if (n[i] % 2 != 0) {
					j++;
					throw new OddException("The Number is odd " , n[i]);
				}
			} catch (OddException e) {
				System.out.println("Caught my Exception");
				System.out.println("Invalid Numbers are : " + j);
				System.out.println(e.getMessage());

			}
		}

	}
}
