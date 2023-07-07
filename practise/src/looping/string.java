package looping;

public class string {

	public static void main(String[] args) {
		String str = "Chandrakant@gmail.com";
		String str1 = "";
		int startIndex = str.indexOf("@");
		int lastIndex = str.indexOf(".");

		for (int i = startIndex + 1; i < lastIndex; i++) {
			str1 = str1 + str.charAt(i);
		}

		System.out.println(str1);
	}

}
//@