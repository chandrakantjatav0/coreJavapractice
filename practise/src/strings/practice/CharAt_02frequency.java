package strings.practice;

public class CharAt_02frequency {

	public static void main(String[] args) {
		String str = "Welcome to the Java World";
		int count = 0;
		for (int i = 0; i <= str.length() - 1; i++) {
			if (str.charAt(i) == 't') {
				count++;
			}
		}
		System.out.println("Frequency of t is = " + count);
	}
}
