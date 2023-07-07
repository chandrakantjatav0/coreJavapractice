package iheritance;

class Animal2 {
	void eat() {
		System.out.println("Eating..");
	}
}

class Dog2 extends Animal2 {
	void bark() {
		System.out.println("Barking..");
	}
}

class Cat2 extends Animal2 {
	void meow() {
		System.out.println("Meowing..");
	}
}

public class HierarchicalInheritance {
	public static void main(String[] args) {
		Cat2 c = new Cat2();
		c.eat();
		c.meow();
		Dog2 d = new Dog2();
		d.bark();
	}
}