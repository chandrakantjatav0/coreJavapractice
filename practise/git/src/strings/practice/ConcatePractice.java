package strings.practice;

public class ConcatePractice {

	public static void main(String[] args) {
   String s1="Hello";
   String s2=" World";
   String s3= "Program";
	String s4= s1.concat(s2);	   
   System.out.println(s4);
   String s5=s1.concat("@").concat(s3);
   System.out.println(s5);
   
	}
   
}
