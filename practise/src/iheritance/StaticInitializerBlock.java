package iheritance;

class Business {
static	{
		System.out.println("MBA CHAIWALA" + '\n');

	}
	int phoneNo = 327832893;
	String name = "zxc", bsname = "fgh";
	void sales() {
		System.out.println("Business Name : " + bsname + "\n" + "Phone no :" + phoneNo + "+\n" + "Name:" + name);
	}

}

class worker extends Business {
	int phoneNo=987678909;
	String name="abc", work="xcv";
	void display() {
		System.out.println("PhoneNo:"+phoneNo+"\n"+"Name:"+name+"\n"+"Work:"+work);
	}
}

public class StaticInitializerBlock {
	public static void main(String[] args) {

		worker worker = new worker();
		worker.sales();
		System.out.println();
		worker.display();
//		System.out.println();
//		worker worker1 = new worker();
//		worker1.sales();
//		System.out.println();
//		worker1.display();
	}
}
