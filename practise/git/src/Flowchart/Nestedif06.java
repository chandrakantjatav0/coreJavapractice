package Flowchart;

public class Nestedif06 {
	public static void main(String args[]) {
		int a = 1000, b = 8000, c = 11000, d = 6000;

		if (a > b) {
			if (a > c) {
				if (a > d) {
					System.out.println(a);
				} else {
					System.out.println(d);
				}
			} else if (c > d) {
				System.out.println(c);
			} else {
				System.out.println(d);
			}

		} else if (b > c) {
			if (b > d) {
				System.out.println(b);
			} else {
				System.out.println(d);
			}
		} else if (c > d) {
			System.out.println(c);
		} else {
			System.out.println(d);
		}
	}

}
