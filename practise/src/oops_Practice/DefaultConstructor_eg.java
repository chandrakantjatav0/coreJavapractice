package oops_Practice;
public class DefaultConstructor_eg {
	int id;
	String name;
	void display() {
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		 DefaultConstructor_eg s1 = new  DefaultConstructor_eg();
		 DefaultConstructor_eg s2 = new  DefaultConstructor_eg();
		s1.display();
		s2.display();
		

	}
}

