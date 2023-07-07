package encapsulation;

class Bank {
	private int customer_id;
	private long acc_no;
	private String name;
	private int atm_pin;

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public long getAcc_no() {
		return acc_no;
	}

	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAtm_pin() {
		return atm_pin;
	}

	public void setAtm_pin(int atm_pin) {
		this.atm_pin = atm_pin;
	}
}

public class Test_Encapsulation3 {
	public static void main(String[] args) {
		Bank b = new Bank();
		b.setCustomer_id(12);
		b.setAcc_no(10023400000456789l);
		b.setName("Chandrakant");
		b.setAtm_pin(1234);
		{

			System.out
					.println(b.getCustomer_id() + " | " + b.getAcc_no() + " | " + b.getName() + " | " + b.getAtm_pin());
		}
		{
			System.out.println("Customer_id : " + b.getCustomer_id());
		}
		{
			System.out.println("Account no : " + b.getAcc_no());
		}
		{
			System.out.println("Customer name : " + b.getName());
		}
		{
			System.out.println("ATM pin : " + b.getAtm_pin());
		}
	}
}
