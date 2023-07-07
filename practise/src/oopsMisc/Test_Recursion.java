package oopsMisc;

public class Test_Recursion {
static int count = 0;
static void j() {
	count++;
	if (count<6l) {
		System.out.println("Java"+count);
		j();
	}
}
	
	public static void main(String []args) {
		j();
	}
	
}

