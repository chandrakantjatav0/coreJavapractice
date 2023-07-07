package oops_Practice;

public class Student {
	int id = 4;
	String name = "chandu";

	public static void main(String args[]) {
		Student s1 = new Student();
		{
			System.out.println(s1.id);
			{
				System.out.println(s1.name);
			}
		}
	}
}
