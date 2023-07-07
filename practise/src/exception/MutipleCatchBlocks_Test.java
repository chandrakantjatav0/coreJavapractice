package exception;

public class MutipleCatchBlocks_Test {
	public static void main(String[] args) {
//		try {
//			int a[] = new int[5];
//			a[5] = 30 / 0;
//		} catch (ArithmeticException a) {
//			System.out.println("Arithmetic Exception occurs");
//		} catch (ArrayIndexOutOfBoundsException a) {
//			System.out.println("Array Index Out Of Bounds Exception occurs");
//		} catch (Exception e) {
//			System.out.println("Parent Exception Occurs ");
//		}
//		System.out.println("Rest of the code ");

		// ***********************************
//		try {
//			int a[] = new int[5];
//			System.out.println(a[10]);
//		} catch (ArithmeticException a) {
//			System.out.println("Arithmetic Exception occurs");
//		} catch (ArrayIndexOutOfBoundsException a) {
//			System.out.println("Array Index Out Of Bounds Exception occurs ");
//		} catch (Exception a) {
//			System.out.println("Parent Exception Occurs");
//		}
//		System.out.println("Rest the code ");

		// ********************************************
//		try {
//			int a[] = new int[5];
//			a[5] = 30 / 0;
//			System.out.println(a[10]);
//		} catch (ArithmeticException e) {
//			System.out.println("Arithmetic Exception occurs");
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("Array Index out of Bound Exception occurs");
//		} catch (Exception e) {
//			System.out.println("Exception occurs");
//		}
//		System.out.println("Rest of the code execute");

		// ***************************************************//
//		try {
//			String s = null;
//			System.out.println(s.length());
//		} catch (ArithmeticException e) {
//			System.out.println("Arithmetic Exception occurs");
//		} catch (StringIndexOutOfBoundsException e) {
//			System.out.println("Array Index out of Bound Exception occurs");
//		} catch (Exception e) {
//			System.out.println(" Parent Exception oocurs");
//		}
//		System.out.println("REst of the code");

		// *******************************************//
		try {
			int a[] = new int[4];
			a[4]= 30/0;
		} catch (Exception e) {
			//e.printStackTrace();
			
			System.out.println("Common Task completed"+e);
		}
//		catch (ArithmeticException e) {
//			System.out.println("Task 1 completed");
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println(" Task 2 completed");
//		}
//		System.out.println("REst of the code");

	}
}
