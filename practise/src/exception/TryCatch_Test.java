package exception;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TryCatch_Test {
	public static void main(String[] args) {
		// ****to resolve the exception in a catch block.
//		int a = 100;
//		int b = 0;
//		int data;
//		try {
//			data = a / b;
//		} catch (Exception e) {
//			System.out.println(a / (b + 4));
//		}

//

		// ***In this example, along with try block, we also enclose exception code in a
		// catch block.

//		try {
//			int data1 = 60 / 0;
//		} catch (Exception e) {
//			int data2 = 60 / 0;
//		}
//		System.out.println("rest of the code");

		// **** try to handle the ArithmeticException using

//		try {
//			int data = 100 / 0;
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println(e);
//		}
//		System.out.println("rest of the code... ");

		// **** handle another unchecked exception.

//		try {
//			int arr[] = { 2, 3, 4, 5 };
//			System.out.println(arr[6]);
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println(e);
//		}
//		System.out.println("rest of the code..");

		// *****providing the checked exception handler
//		PrintWriter pw;
//		try {
//			pw = new PrintWriter("jpg.text");
//			pw.println("saved");
//		} catch (FileNotFoundException e) {
//			System.out.println(e);
//		}
//		System.out.println("File Saved Sucessfully");

		// ****unchecked exception, handle String exception
		try {
			String str = "Chandrakant";
			System.out.println(str.substring(0,12));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("Rest of code...");
	}
}