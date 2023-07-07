package polymorphism;

import java.util.Scanner;

class Alexa {

}

class Blexa extends Alexa {

}

class Clexa extends Alexa {

}

public class Instanceof {
	public static void main(String[] args) {

		Alexa a = new Blexa();
		System.out.println(a instanceof Alexa);
		System.out.println(a instanceof Blexa);
		System.out.println(a instanceof Clexa);
	}

}
