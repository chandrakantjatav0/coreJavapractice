package iheritance;

class Employeee00{
	{
		System.out.println("Daynil Group");
	}
	int id;
	String name,address;
	Employeee00(int id,String name,String address){
		this.id=id;
		this.name=name;
		this.address=address;
	}
	void show() {
		System.out.println("Id:"+id+"\n"+"Name:"+name+"\n"+"Address:"+address);
	}
}
class Intern extends Employeee00{
	
	String javaIntern;
	long mobNo;

	Intern(String javaIntern,long mobNo,int id, String name,String address){
		super(id,name, address);
		this.javaIntern=javaIntern;
		this.mobNo=mobNo;
		
	}
	void display() {
		System.out.println("Intern:"+javaIntern+"\n"+"MobileNo:"+mobNo);
	}
	
}
public class IstanceInitializerBlock {

	public static void main(String[] args) {
		Intern intern=new Intern("CoreJava",987654567l,11,"Vivek","Kalyan");
		intern.show();
		intern.display();
		System.out.println();
		Intern intern1=new Intern("CoreJava",777654567l,11,"Chandrakant","Dombivali");
		intern1.show();
		intern1.display();

	}

}
