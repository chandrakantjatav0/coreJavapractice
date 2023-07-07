package controlstatements0;

import java.util.Scanner;

public class Ifelseifladder {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A:");
		int a = sc.nextInt();
		System.out.println("Enter B:");
		int b = sc.nextInt();

		if (a == b) {
			System.out.println("Equal");
		} else {
			if (a < b) {
				System.out.println(" B is Greater");
			} else {
				System.out.println("B is lesser");
			}
		}

	}
}