package polymorphism;
class Bike1{
//	final 
	void run() {
		System.out.println("Bike running safely");
	}
}class HeroBike extends Bike1{
	void run() {
		System.out.println("Bike giving Mileage 60kmph");
	}
}
public class FinalMethod {
	public static void main (String [] args) {
		HeroBike hb = new HeroBike();
		hb.run();
	}
}