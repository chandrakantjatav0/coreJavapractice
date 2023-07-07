package strings.practice;

public class Compare01 {
public static void main (String args[]) {
	String s1= "HELLO";
	String s2 ="Hello";
	String s3 ="hello";
	String s4 ="ayello";
	String s5 = "HELLO";
	System.out.println(s1.compareTo(s5));
	System.out.println(s1.compareTo(s3));
	System.out.println(s2.compareTo(s4));
	System.out.println(s5.compareTo(s2));
}
}
