package oopsMisc;

public class Wrapper_class {
	public static void main(String[] args) {
		byte b = 5;
		short s = 10;
		int i = 20;
		long l = 30;
		float f = 40f;
		double d = 50d;
		char c = 'a';
		boolean b1 = true;
		// AutoBoxing : Converting primitive into Objects
		byte byteobj = b;
		short shortobj = s;
		int intobj = i;
		long longobj = l;
		float floatobj = f;
		double doubleobj = d;
		char charobj = c;
		boolean booleanobj = b1;
		//printing objects.....
		System.out.println("-----Printing object values-----");
		System.out.println("Byte object : " + byteobj);
		System.out.println("Short object : " + shortobj);
		System.out.println("integer object : " + intobj);
		System.out.println("long object : " + longobj);
		System.out.println("float object : " + floatobj);
		System.out.println("double object : " + doubleobj);
		System.out.println("Char object : " + charobj);
		System.out.println("Boolean object : " + booleanobj);
		
		//Unboxing : Converting Object into Primitives
		byte byteValue = byteobj;
		short shortValue = shortobj;
		int intValue= intobj;
		long longValue =longobj;
		float floatValue = floatobj;
		double doubleValue = doubleobj;
		char charValue = charobj;
		boolean booleanValue = booleanobj;
		//printing the Primitives......
		System.out.println("-----Printing Primitive values-----");
		System.out.println("Byte Value : " + byteValue);
		System.out.println("Short Value : " + shortValue);
		System.out.println("integer Value : " + intValue);
		System.out.println("long Value : " + longValue);
		System.out.println("float Value : " + floatValue);
		System.out.println("double Value : " + doubleValue);
		System.out.println("Char Value : " + charValue);
		System.out.println("Boolean Value : " + booleanValue);
	}
}
