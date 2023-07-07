package Flowchart;

public class Ifelse02 {

	public static void main(String[] args) {
			int a = 2, b = 3, c = 1;
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
	