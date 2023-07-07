package Flowchart;

public class Ifelse03 {
		public static void main(String [] args) {
			int a = 3, b = 1, c = 2;
			if (a > b) {
				if (a > c) {
					System.out.println(a);
				} else {
					System.out.println(c);
				}
			} else {
				if (b > c) {
					System.out.println(b);
				} else {
					System.out.println(a);
				}
			}
		}
	}

