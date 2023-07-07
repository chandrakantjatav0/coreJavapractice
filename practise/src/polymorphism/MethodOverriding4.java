package polymorphism;

class MotorVehicle extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {

			System.out.println("Child thread");
		}
	}

	synchronized void m1() {
		System.out.println("Hello");
	}
}

public class MethodOverriding4 {

	public static void main(String[] args) {
		MotorVehicle t = new MotorVehicle();
		t.start();
		t.m1();
		for (int i = 1; i <= 5; i++) {

			System.out.println("Main Thread");

		}

//			HashSet<String> hs = new HashSet<String>();

	}
}
