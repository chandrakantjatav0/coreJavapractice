package iheritance;

class Shopkeeper {

	void shop() {
		System.out.println("Shopkeeper sells Grocery...");
	}
}

class Customer extends Shopkeeper {
	void buy() {
		System.out.println("Customers purchases Grocery...");
	}
}

public class Test_Inheritance2 {

	public static void main(String[] args) {
		Customer cus = new Customer();
		cus.shop();
		cus.buy();

	}

}
