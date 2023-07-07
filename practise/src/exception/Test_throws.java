package exception;

import java.io.IOException;

public class Test_throws {
	void m() throws IOException {
		throw new IOException("Device Errors");
	}

	void n() throws IOException {
		m();
	}

	void k() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("Exception handled");
		}
	}

	public static void main(String[] args) throws Exception  {
		Test_throws tt = new Test_throws();
		tt.m();
		System.out.println("Normal flow");
	}
}