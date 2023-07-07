package oops_Practice;

public class ConstructorDemo {
	public static void main(String args[]){  
		//creating objects  
		Student37 s1=new Student37();  
		Student37 s2=new Student37();  
		//displaying values of the object  
		s1.display();  
		s2.display();  
		}  
}
	//Let us see another example of default constructor  
	//which displays the default values 
	class Student37{  
	int id;  
	String name;  
	int rollNo;  
	public Student37(int id, String name, int rollNo, String classname) {
		super();
		this.id = id;
		this.name = name;
		this.rollNo = rollNo;
		Classname = classname;
	}
	
	public Student37() {
	}

	@Override
	public String toString() {
		return "Student37 [id=" + id + ", name=" + name + ", rollNo=" + rollNo + ", Classname=" + Classname + "]";
	}

	String Classname; 
	//method to display the value of id and name  
	void display(){System.out.println(id+" "+name);}  
	  
}
