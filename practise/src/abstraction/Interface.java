package abstraction;

import java.util.Scanner;

interface Client {
	public void Input();

	public void Output();
}

class Chandu implements Client {

	int id;
	String name;
	double sal;

	@Override
	public void Input() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your ID :     ");
		id = sc.nextInt();
		System.out.println("Enter your Username :    ");
		name = sc.next();
		System.out.println("Enter your Salary :     ");
		sal = sc.nextDouble();
	}

	@Override
	public void Output() {

		System.out.println(id + " " + name + " " + sal);
	}
}

public class Interface {
	public static void main(String[] args) {
		Client c = new Chandu();
		c.Input();
		c.Output();
	}

}
