package Flowchart;

public class Nestedif04 {

	public static void main(String[] args) {
		int a = 2, b = 1, c = 1, d = 4;
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
