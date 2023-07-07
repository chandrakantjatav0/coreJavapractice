package Flowchart;

public class Nestedif02 {
	public static void main(String[] args) {
		int a = 4, b = 3, c = 21, d = 1;
		if (a > b) {
			if (a > c) {
				if (a > d) {
					
					System.out.println(a);
				
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
