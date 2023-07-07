package strings.practice;

public class Concat01 {
	public static void main(String args[]) {
		String s1 = "java String ";
		{
			s1.concat("is immutable");
			{
				System.out.println(s1);
				{
					s1 = s1.concat("is immutable so  assign its Explicity.");
					{
						System.out.println(s1);
					}
				}
			}
		}
	}
}