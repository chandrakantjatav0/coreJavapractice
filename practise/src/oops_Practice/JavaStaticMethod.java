package oops_Practice;
	class Student6{
		int id;
		String name;
		int age;
		static String college = "A.V.M";

		static void change() {
		 college = "Sahyog College";
		}

		Student6(int i, String n, int a) {
			id = i;
			name = n;
			age = a;
		}

		void display() {
			System.out.println(id + " " + name + " " + age + " " +college);
		}
	}
	class JavaStaticMethod {
		public static void main(String[] args) {
			Student6.change();
			Student6 j1 = new Student6(101, "Chandrakant", 20);
			Student6 j2 = new Student6(102, "Chandu", 20);
			j1.display();
			j2.display();
		}
	}
	
