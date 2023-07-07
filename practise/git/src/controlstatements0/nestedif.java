package controlstatements0;

public class nestedif {
	public static void main(String[] args) {
		int a = 8, b = 5, c = 2, d = 6;
		if (a > b) {
			if (a > c) {
				if (a > d) {
					System.out.println("a");
				} else {
					System.out.println("d");
				}
			} else {
				if (c > d) {
					System.out.println("c");

				} else {
					System.out.println("d");
				}
			}
}
	
	  if (b > c) {
	     if (b > d) {
		System.out.println("b");
	} else {
			System.out.println("d");
		}

	} else {
		if (c > d) {
			System.out.println("c");
	} else {
			System.out.println("d");
		}
	}

}
}