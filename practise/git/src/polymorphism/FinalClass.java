package polymorphism;
// final
class Bike2{
 
	void run() {
		System.out.println("Bike running safely");
	}
}class HeroBike1 extends Bike2{
	void run() {
		System.out.println("Bike giving Mileage 60kmph");
	}
}
public class FinalClass {
	public static void main (String [] args) {
		HeroBike1 hb = new HeroBike1();
		hb.run();
	}
}

