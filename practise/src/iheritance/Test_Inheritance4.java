package iheritance;
												//multilevel Inheritance
class Company {
	void firm() {
		System.out.println("Company aim is to make employement..");
	}
}

class Ceo extends Company {
	void owner() {
		System.out.println("Ceo is the owner of company..");
	}
}

class HR extends Ceo {
	void manage() {
		System.out.println("HR manages all company recruit ..");
	}
}

class Employee extends HR {
	void work() {
		System.out.println("Employee works for company");
	}
}
public class Test_Inheritance4 {
public static void main(String []args) {
	Employee e1 = new Employee();
	e1.firm();
	e1.owner();
	e1.manage();
	e1.work();
	
}
}
