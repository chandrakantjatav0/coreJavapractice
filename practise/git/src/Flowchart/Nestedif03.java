package Flowchart;

public class Nestedif03 {
	public static void main(String[] args) {
		int a = 3, b = 4, c = 1, d = 2;
		if (a > b) {
			if (a > c) {
				if (a > d) {
					{
					System.out.println(a);
				}
				}else {
				System.out.println(d);
			}
			}else
				if(c > d)
			{
				System.out.println(d);
			}
			}else {
			if (b > c) {
				if (b > d) {
					{
						System.out.println(b);
					}
				}else {
					System.out.println(d);
				}
			
				
	}else{
			if (c > d) {
				System.out.println(c);
			} else {
				System.out.println(d);
			}

		}

		
}
}
}
