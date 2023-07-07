package polymorphism;

class Vehicle {
	void run() {
		System.out.println("Vehicle is  Running");
	}
}

class Bike extends Vehicle {
////@override
	void run() {
	//	super.run();
		System.out.println("Bike is Running Safely");
	}
}

public class MethodOverriding {
	public static void main(String args[]) {
		Vehicle bk = new Bike();
		bk.run();
		Vehicle vh = new Vehicle();
		vh.run();
	}
}
