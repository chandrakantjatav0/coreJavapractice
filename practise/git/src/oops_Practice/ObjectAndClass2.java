package oops_Practice;
class rectangle1{
int length;
int width;
void insert(int l, int w){
	length = l;
	width = w;
} void calculate() {
	System.out.println(length*width);	
}
}
public class ObjectAndClass2 {

	public static void main(String[] args) {
		rectangle1 r1 = new rectangle1();
		rectangle1 r2 = new rectangle1();
		r1.insert(12,5);
		r2.insert(15,5);
		r1.calculate();
		r2.calculate();
	}

}
