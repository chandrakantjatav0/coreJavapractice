package encapsulation;

class Student {
	private int id;
	private String name;
	private long phone_no;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(long phone_no) {
		this.phone_no = phone_no;
	}
}

public class Test_Encapsulation2 {
	public static void main(String[] args) {
		Student st = new Student();
		st.setId(15);
		st.setName("Chandrakant");
		st.setPhone_no(987654321l);
		{
			System.out.println(st.getId() + " | " + st.getName() + " | " + st.getPhone_no());
		}
	}
}
