package polymorphism;
							//changing no. of arguments
class A {
	void add() {
		int a = 10 ,b = 30, c;
		c = a + b;
		System.out.println(c);
	} void add(int x, int y) {
		int c;
		c= x + y;
		System.out.println(c);
	}
}  
public class MethodOverloading {
   public static void main(String []args) {
	   A v = new A();
	   v.add();
	   v.add(50,10);
	   System.out.println();
   }
}