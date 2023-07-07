package task;

public class Teacher {
	void teach() {
		System.out.println("Teacher Teaching Well");
	}

	public static void main(String[] args) {
		School sc = new School();
		Teacher t = new Teacher();
		Student st = new Student();
		sc.school();
		t.teach();
		st.setId(12);
		st.setName("Chandrakant");
		System.out.println(st.getId() + " : " + st.getName());
	}
}
