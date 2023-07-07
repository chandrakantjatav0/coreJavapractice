package oops_Practice;

class rohit{
	void display() {
		System.out.println("class called ");
	}
}

public class ParameterizedConstructor_eg {
	int id;
	String name;
	ParameterizedConstructor_eg (int i, String n){
		id = i;
		name = n;
	}
	void display() {
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) {
		rohit r= new rohit();
		r.display();
		ParameterizedConstructor_eg s1 = new ParameterizedConstructor_eg (101,"Chandrakant");
		ParameterizedConstructor_eg s2 = new ParameterizedConstructor_eg (102,"Chandu");
		s1.display();
		s2.display();

	}

}
