package encapsulation; //private class

class A {
	private int data = 10;

	// private String str = "chandu";{
	private void msg() {
		System.out.println("Hello");
	}
//	{
//		System.out.println(data + " " + str);
//	}
}

public class Test_AccessModifiers {
	public static void main(String[] args) {
		A a = new A();
		// System.out.println(a.data);
		// a.msg();
//		a.data();
//		a.str();
	}
}
