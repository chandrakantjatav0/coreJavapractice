package task;

import java.util.ArrayList;

public class Test_collection2 {
	public static int mul(int i) {
		return i * 5;
	}

	public static float div(float i) {
		return i / 5;
	}

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(30);
		al.add(35);
		al.add(64);
		al.add(20);
		al.add(88);
		al.add(95);
		al.add(64);
		al.add(33);
		al.add(40);
		ArrayList<Integer> all = new ArrayList<Integer>();
		all.add(50);
		all.add(10);
		all.add(90);
		all.add(60);
		all.add(64);
		all.add(88);
		for (Integer i : al) {

			if (all.contains(i)) {
				System.out.println("Same data Exist so no Multiplication & Division");

				
			} else if (al.contains(i)) {
				System.out.print("Multiply : ");
				System.out.println(mul(i));
				System.out.print("Divison : ");
				System.out.println(div(i));
			}

		}
	}
}
