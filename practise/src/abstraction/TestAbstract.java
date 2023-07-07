package abstraction;

abstract class Shape {
abstract void draw();
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("Drawing Rectangle");
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("Drawing Circle");
	}
}

public class TestAbstract {
	public static void main(String[] args) {
		Shape cc = new Circle();   ///...we can ctreat object refrence of abstract class
		cc.draw();
		Shape s = new Rectangle();
		s.draw();
		//Shape sh = new Shape();    ///....we cannot make object of abstract class
		//sh.draw();
	}
}
