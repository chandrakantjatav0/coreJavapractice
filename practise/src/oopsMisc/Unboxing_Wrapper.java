package oopsMisc;

public class Unboxing_Wrapper {
public static void main(String[]args) {
	Integer a = new Integer (5);
	int i = a.intValue();
	int j = a;
	Float f = new Float(60);
	float k = f.floatValue();
	float l = f;
	System.out.println(a+" "+i+" "+j);
	System.out.println(f+" "+k+" "+l);
	
}
}
