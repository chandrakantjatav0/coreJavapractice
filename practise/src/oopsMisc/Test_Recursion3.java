package oopsMisc;

//Fibonacci series
public class Test_Recursion3 {
//	static int a1 = 0, a2 = 1, a3 = 0;
//
//	static void printFibo(int count) {
//		if (count > 0) {
//			a3 = a1 + a2;
//			a1 = a2;
//			a2 = a3;
//			System.out.println(" " + a3);
//			printFibo(count - 1);
//		}
//	}
	class Bike{
		

		public static  double getPrice() {
			double price=50000;
			return price;
			
		}
	}

	public static void main(String[] args) {
//		int count = 20;
//		System.out.println(a1 + " " + a2);
//		printFibo(count - 1);
		
		int quantity=2;
		double totalPrice=Bike.getPrice()*quantity;
		System.out.println("Quantity:"+quantity+"\n"+"Total Price:"+totalPrice);
	}
}
