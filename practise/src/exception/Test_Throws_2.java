package exception;



//*****Declare Exceptions*********
//if exception does not occurs...
//class M {
//	void method() {
//		System.out.println("Device operations operands");
//	}
//}
//
//public class Test_Throws_2 {
//	public static void main(String[] args) {
//		M k = new M();
//		k.method();
//		System.out.println("normal flow");
//	}
//}

///throwing checked Exception
import java.io.*;

class Main {
	public static void findFile() throws IOException {
		throw new IOException("File not found");
	}

	public static void main(String[] args) {
		try {
			findFile();
			System.out.println("Rest of code in try block");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}