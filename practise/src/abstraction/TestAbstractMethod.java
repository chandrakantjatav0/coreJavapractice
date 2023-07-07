package abstraction;

abstract class programming {
	abstract void developer();
}

class Java extends programming {
	void developer() {
		System.out.println("JAMES GOSLING");
	}
}

class HTML extends programming {
	void developer() {
		System.out.println("TIM BERNERS LEE");
	}
}

public class TestAbstractMethod {
	public static void main(String[] args) {
		programming j = new Java();
		j.developer();
		programming h = new HTML();
		h.developer();
	}
}
