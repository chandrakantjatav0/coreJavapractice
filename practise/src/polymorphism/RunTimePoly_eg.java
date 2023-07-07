package polymorphism;

class RBIBank {
	float getRateOfInterest() {
		return (0);
	}
}

class SBI extends RBIBank {
	float getRateOfInterest() {
		return (6.2f);
	}
}

class IDFC extends RBIBank {
	float getRateOfInterest() {
		return (8.2f);
	}
}

class BOI extends RBIBank {
	float getRateOfInterest() {
		return (6.7f);
	}
}

class AXIS extends RBIBank {
	float getRateOfInterest() {
		return (7.1f);
	}
}

class ICICI extends RBIBank {
	float getRateOfInterest() {
		return (7.5f);
	}
}

public class RunTimePoly_eg {
	public static void main(String[] args) {
		RBIBank RB;
		RB = new SBI();
		{
			System.out.println("SBI Bank Rate of Interest is : " + RB.getRateOfInterest());
		}
		RB = new IDFC();
		{
			System.out.println("IDFC Bank Rate of Interest is : " + RB.getRateOfInterest());
		}
		RB = new BOI();
		{
			System.out.println("IDFC Bank Rate of Interest is : " + RB.getRateOfInterest());
		}
		RB = new AXIS();
		{
			System.out.println("IDFC Bank Rate of Interest is : " + RB.getRateOfInterest());
		}
		RB = new ICICI();
		{
			System.out.println("IDFC Bank Rate of Interest is : " + RB.getRateOfInterest());
		}
	}

}
