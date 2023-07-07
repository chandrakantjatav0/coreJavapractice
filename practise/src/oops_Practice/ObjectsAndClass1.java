package oops_Practice;

class Student4 {
	int rollNo;
	String name;

	void insertRecord(int r, String n) {
		rollNo = r;
		name = n;

	}

	void displayInformation() {
		System.out.println(rollNo + " " + name);
	}
}

public class ObjectsAndClass1 {

	public static void main(String[] args) {
		Student4 str1 = new Student4();
		Student4 str2 = new Student4();
		str1.insertRecord(101, "Chandrakant");
		str2.insertRecord(102, "vivek");
		str1.displayInformation();
		str2.displayInformation();

	}

}
