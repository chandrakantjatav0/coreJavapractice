package Flowchart;

public class Ifelse04 {
	public static void main(String args[]) {
		int a = 1, b = 1, c = 1;
		{
			System.out.println("all values are same : )");
		}
		if (a > b)
			if (a > c) {
				System.out.println(a);
			} else {
				System.out.println(c);
			}
		else {
			if (b > c) {
				System.out.println(b);
			} else {
				System.out.println(a);
			}
		}
	}
}