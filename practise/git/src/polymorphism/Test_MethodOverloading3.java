package polymorphism;
class Calculate {
	void addnum() {
		int x = 30;
		int y = 10;
		System.out.println(x+y);
	}void addnum(int i , int j){
		i  = 15;
		j = 20;
		System.out.println(i<j);
	}
}
public class Test_MethodOverloading3 {
public static void main(String []args) {
	Calculate c = new Calculate();
	c.addnum();
	c.addnum(15,20);
}
}
