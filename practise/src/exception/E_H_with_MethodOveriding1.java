
//*****************************If the superclass method declares an exception***********
package exception;
//Example in case subclass overridden method declares parent exception

class Parent1 {
	void msg() throws ArithmeticException {
		System.out.println("Parent class Method called");
	}
}

public class E_H_with_MethodOveriding1 extends Parent1 {
	void msg() throws ArithmeticException {
		System.out.println("Child class Method Called");
	}

	public static void main(String[] args) {
		Parent1 p = new E_H_with_MethodOveriding1();
		p.msg();
	}
}
