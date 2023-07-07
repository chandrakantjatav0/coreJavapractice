package oops_Practice;
class bike{
	int speedlimit=100;
	void run() {
		System.out.println(speedlimit);
		speedlimit= 80;
		System.out.println(speedlimit);
	}
}
public class ExampleOfInstanceInitializer {
public static void main (String []args) {
	bike b = new bike();
		//System.out.println(b instanceof bike);
	b.run();
}
}