package arrays.practice;

//minimum number of an array using a method
public class TestMethod {
//static void min(int arr[]) {
//	int min = arr[0];
//	for (int i = 0;i<arr.length;i++) 
//	if (min>arr[i])
//	min=arr[i];
//	System.out.println(min);
//
//}
//
//	public static void main(String[] args) {
//		int a[] = {  3, 5, 6, 2 };
//		min(a);

//	static int[] get() {
//		return new int[] { 22, 33, 44, 55 };
//	}
//
//	public static void main(String[] args) {
//		int arr[] = get();
//		for (int i = 0; i < arr.length; i++)
//			
//		System.out.println(arr[i]);

	// Java Program to demonstrate the case of
	// ArrayIndexOutOfBoundsException in a Java Array.
//	public static void main(String[] args) {
//		int arr[] = { 10, 20, 30, 40, 50, 60 };
//		for (int k = 0; k <= arr.length; k++)
//			System.out.println(arr[k]);

	// ****** Multidimensional Array
//	public static void main(String[] args) {
//		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
//		for (int a = 0; a < arr.length; a++) {
//			for (int b = 0; b < arr.length; b++) {
//				System.out.print(arr[a][b] + "  ");
//			}
//			System.out.println("\n");
//		}

	// ****2Java Program to illustrate the jagged array
//	public static void main(String[] args) {
//		int arr[][] = new int[3][];
//		arr[0] = new int[3];
//		arr[1] = new int[4];;
//		arr[2] = new int[2];
//		int count = 0;
//		for (int n = 0; n < arr.length; n++)
//			for (int m = 0; m < arr[n].length; m++)
//				arr[n][m] = count++;
//
//		for (int n = 0; n < arr.length; n++) {
//			for (int m = 0; m < arr[n].length; m++) {
//				System.out.print(arr[n][m] + " ");
//			}
//
//			System.out.println();
//		}

	// ***Java Program to demonstrate the addition of two matrices in Java
//	public static void main(String[] args) {
//		int a[][] = { { 2, 3, 4 }, { 2, 3, 4 } };
//		int b[][] = { { 2, 3, 4 }, { 2, 3, 4 } };
//		int c[][] = new int[2][3];
//		for (int k = 0; k < 2; k++) {
//			for (int l = 0; k < 3; l++) {
//				c[k][l] = a[k][l] + b[k][l];
//				System.out.print(c[k][l]+ " ");
//			}
//			System.out.println();
//		}
			
	     
				//**Java Program to multiply two matrices***
	public static void main (String [] args) {
		int a [][]= {{2,2,2},{3,3,3},{4,4,4}};
		int b [][]= {{2,2,2},{3,3,3},{4,4,4}};
		int c [][]= new int [3][3];
		for(int x = 0; x < 3 ; x++) {
			for(int y = 0; y < 3; y++) {
				c[x][y]=0;
				for(int z = 0; z < 3 ; z++) {
					c[x][y]= a[x][z]*b[z][y];
				}System.out.print(c[x][y]+ " ");
			}System.out.println();
		}
	}
}
