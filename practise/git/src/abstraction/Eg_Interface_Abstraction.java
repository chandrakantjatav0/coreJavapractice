package abstraction;

interface A {
	void a();

	void b();

	void c();

	void d();

	void e();
}

abstract class B implements A {
	public void c() {
		System.out.println("I am c");
	}
}
//
//abstract class C implements A {
//	public void d() {
//		System.out.println("I am d");
//	}
//}

class M extends B {
	public void a() {
		System.out.println("I am a");
	}

	public void b() {
		System.out.println("I am b");
	}

	public void e() {
		System.out.println("I am e");
	}

	@Override
	public void d() {
		System.out.println("I am d");
	}
}

public class Eg_Interface_Abstraction {
	public static void main(String[] args) {
		A a = new M();
		a.a();
		a.b();
		a.c();
		a.d();
		a.e();
	}
}
