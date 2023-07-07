package strings.practice;
import java.util.Scanner;

public class StringsImmutable {

	public static void main(String[] args) {
		String str = new String("Java");
		String s = "C++";
		String str1 = "Java";
		String str2 = new String("Java");
		String str3 = new String("Java Class");
		String str4 = new String("java class");
		String str5 = new String("java class");

	
	System.out.println(str);
	System.out.println(s);
	System.out.println(str1);
	System.out.println(str2);
	System.out.println(str3);
	System.out.println(str4);
	System.out.println(str5);
	}
}


//	    public static void main(String[] args) {
//	        Scanner scan = new Scanner(System.in);
//	        int i = 100; scan.nextInt(); 
//	         double d = 42; 
//	         String s = "42 is the answer to life, the universe, and everything!";
//	        System.out.println("String: " + s);
//	        System.out.println("Double: " + d);
//	        System.out.println("Int: " + i);
//	    }
//	}


