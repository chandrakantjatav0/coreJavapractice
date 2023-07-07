package iheritance;
class Animal1{
	void eat() {
		System.out.println("Eating...");
	}
} class Dog1 extends Animal1{
	void bark(){
		System.out.println("Barking..");
	}
}class Cat extends Dog1{
	void meow() {
		System.out.println("Meowing...");
	}
} class Cow extends Cat{
	void moo() {
		System.out.println("MoOoing...");
	}
}
public class MultilevelIheritance {
	public static void main (String[]args) {
		Cow c = new Cow();
		c.bark();
		c.meow();
		c.moo();
		c.eat();
	}

}
