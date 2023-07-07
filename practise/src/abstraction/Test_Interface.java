package abstraction;

interface Bank {
	float rateOfInterest();
}

class BOI implements Bank {

	public float rateOfInterest() {
		return 7.6f;
	}
}

class BARODA implements Bank {
	public float rateOfInterest() {
		return 6.5f;
	}
}

public class Test_Interface {
	public static void main(String[] args) {
		Bank br = new BOI();
		{
			System.out.println("Rate of Interest :" + br.rateOfInterest());
		}
		Bank b = new BARODA();
		{
			System.out.println("Rate of Interest :" + b.rateOfInterest());
		}

	}
}
