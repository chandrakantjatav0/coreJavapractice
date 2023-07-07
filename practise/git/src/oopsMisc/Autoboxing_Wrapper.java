package oopsMisc;

public class Autoboxing_Wrapper {
	public static void main(String[] args) {
		int a = 30;
		float f = 20f;
		Integer i = Integer.valueOf(a);  //converting int into Integer explicitly  
		Integer j = (a);   //autoboxing, now compiler will write Integer.valueOf(a) internally  
		Float k = Float.valueOf(f);
		Float l = f;

		System.out.println(a + " " + i + " " + j);
		System.out.println(f + " " + k + " " + l);
	}
}
