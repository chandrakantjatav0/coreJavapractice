package strings.practice;

 final class Person1 {
	final String PancardNumber;
		public Person1 (String PancardNumber) {
			this.PancardNumber = PancardNumber;
		}
			public String getPancardNumber(){
				return PancardNumber;
			}
		
		}
	

public class ImmutableString {
	public static void main(String[] args) {
			Person1 p = new Person1 ("ZVXVX123J");
		String s1 = p.getPancardNumber();
		System.out.println("Pancard Number : "+s1);
	}
}
