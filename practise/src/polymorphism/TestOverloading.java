package polymorphism;

import java.util.Scanner;

class A1 {
	void add () {
		int a = 10, b = 20 ,c;
		c  = a + b;
		System.out.println(c);
	}
	void  add(int x, int y) {
		int c;
		c= x + y;
		System.out.println(c);
	}
}
public class TestOverloading {
	public static void main(String []args) {
		A1 v = new A1();
		v.add();
		v.add(20,30);
		
	}

}
