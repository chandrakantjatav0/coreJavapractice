package exception;
//*********************If the superclass method does not declare an exception***********
import java.io.IOException;
//Checked Exceptions
//class Parent {
//	void msg()  throws IOException {
//		System.out.println("Parent Method Called");
//	}
//}
//
//public class E_H_with_MethodOveriding extends Parent {
//	void msg()  throws IOException {
//		System.out.println("Test Exception Child");
//	}
//
//	public static void main(String[] args) throws IOException {
//		Parent p = new E_H_with_MethodOveriding();
//		p.msg();
//	}
//}

//****************************************************
//	Unchecked Exceptions
class Parent {
	void msg() {
		System.out.println("Parent Method Called");
	}
}

public class E_H_with_MethodOveriding extends Parent {
	void msg() throws ArithmeticException {
		System.out.println("Test Exception Child");
	}

	public static void main(String[] args) {
		Parent p = new E_H_with_MethodOveriding();
		p.msg();
	}
}
