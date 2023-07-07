package Flowchart;

public class Nestedif {

	public static void main(String[] args) {
		int a = 100, b = 400, c = 300, d = 200, e = 500;
		if (a > b) {
			if (a > c) {
				if (a > d) {
					if (a > e) {
						System.out.println(a);
					} else {
						System.out.println(e);
					}
				} else if (d > e) {
					System.out.println(d);
				} else {
					System.out.println(e);
				}
			} else if (c > d) {
				if (c > e) {
					System.out.println(c);
				} else {
					System.out.println(e);
				}
			} else if (d > e) {
				System.out.println(d);
			} else {
				System.out.println(e);
			}
		} else if (b > c) {
			if (b > d) {
				if (b > e) {
					System.out.println(b);
				} else {
					System.out.println(e);
				}
			} else if (d > e) {
				System.out.println(d);
			} else {
				System.out.println(e);
			}
		} else if (c > d) {
			if (c > e) {
				System.out.println(c);
			} else {
				System.out.println(e);
			}

		} else if (d > e) {
			System.out.println(d);
		} else {
			System.out.println(e);
		}

	}
}
