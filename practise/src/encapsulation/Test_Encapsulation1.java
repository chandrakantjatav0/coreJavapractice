package encapsulation;

class Account {
	private long acc_no;
	private String name, gmail;
	private float amount;

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

	public String getGmail() {
		return gmail;
	}

	public void setGmail(String gmail) {
		this.gmail = gmail;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

}

public class Test_Encapsulation1 {
	public static void main(String[] args) {
		int id = 128;
		Account acc = new Account();
		acc.setAcc_no(10234500000678l);
		acc.setName("Chandrakant");
		acc.setGmail("Chandu@daynilgroup.com");
		acc.setAmount(600000f);
		System.out.println(acc.getAcc_no() + " | " + acc.getName() + " | " + acc.getGmail() + " | " + acc.getAmount());
	}
}
