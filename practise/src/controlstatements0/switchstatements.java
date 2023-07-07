package controlstatements0;

import java.util.Scanner;

public class switchstatements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Button ");
		int Button = sc.nextInt();
		switch (Button) {

		case 1:
			System.out.println("Hello");
			break;
		case 2:
			System.out.println("Namaste");
			break;
		case 3:
			System.out.println("Hola");
			break;
		case 4:
			System.out.println("Kem cho");
			break;
		case 5:
			System.out.println("Saalam Waliunkum");
			break;
		default:
			System.out.println("Invalid Button");

		}
	}

}
