package oopsMisc;
/**Write a programe for following :
Well is 12 meter ahead, Frog travel 1 meter in frst hop 3 meter in second and 5meter third hop,
 then repeat, How much hop it needs to  reach to well ?*/
public class FrogTask {
public static void main(String []args) {
	int distance = 20;
	int hop1 = 1;
	int hop2 = 3;
	int hop3 = 5;
	int hops = 0;
	int currentDistance = 0;// current distance
	while (currentDistance < distance) {
		if (currentDistance + hop1 <= distance) {
			hops++;
		}

		if (currentDistance + hop2 <= distance) {
			currentDistance += hop2;
			hops++;
		}

		if (currentDistance + hop3 <= distance) {
			currentDistance += hop3;
			hops++;

		}

	}

	System.out.println("Frog need hops:" + hops);
}
}
