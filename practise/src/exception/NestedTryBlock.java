package exception;

//public class NestedTryBlock {
//	public static void main(String[] args) {
//		try {
//			try {
//				System.out.println("Going to divide by 0");
//				int b = 39 / 0;
//			} catch (ArithmeticException e) {
//				System.out.println(e);
//			}
//			try {
//				int a[] = new int[5];
//				a[5] = 4;
//			} catch (ArrayIndexOutOfBoundsException e) {
//				System.out.println(e);
//			}
//			System.out.println("Other Statement");
//		} catch (Exception e) {
//			System.out.println("Handled by exception(outer catch)");
//		}
//		System.out.println("Normal flow...");
//	}
//}
public class NestedTryBlock {
	public static void main(String[] args) {
		try {
			try {
				try {
					int ar[] = { 1, 2, 3, 4, 5 };
					System.out.println(ar[10]);
				} catch (ArithmeticException e) {
					System.out.println("Arithemetic Exception");
					System.out.println("Inner try block 2");

				}
			} catch (ArithmeticException e) {
				System.out.println("Arithemetic Exception");
				System.out.println("Inner Try block 1");
			}
		} catch (ArrayIndexOutOfBoundsException e2) {
			System.out.println(e2);
			System.out.println("Outer main try block");
		} catch (Exception e) {
			System.out.println("Exception");
			System.out.println("Handled in main try block");
		}
	}
}