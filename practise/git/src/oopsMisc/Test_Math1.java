package oopsMisc;

public class Test_Math1 {
	public static void main(String[] args) {
		double x = 24;
		double y = 3;
		{
			System.out.println("Maximum Number of x  is : " + Math.max(x, y));
			System.out.println("Minimum Number of y is : " + Math.min(x,y));

		}
		{
			System.out.println("Square Root of x : " + Math.sqrt(x));
			System.out.println("Sqaure Root of y : "+Math.sqrt(y));
		}
		{
			System.out.println("Power of x and y : "+Math.pow(x,y));
		}{
			System.out.println("Logarithm of x : "+Math.log(x));
			System.out.println("Logarithm of y : "+Math.log(y));
		}
		{
			System.out.println("log10 of x : "+Math.log10(x));
			System.out.println("log10 of y : "+Math.log10(y));
		}{
			System.out.println("Degree of y is : "+Math.toDegrees(y));
		}
	}
}
