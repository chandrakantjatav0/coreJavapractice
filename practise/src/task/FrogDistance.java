/**
 Write a programe for following :
Well is 12 meter ahead, Frog travel 1 meter in first hop 3 meter in second and 5 meter third hop,
 then repeat, How much hop it needs to  reach to well ?
 */
package task;

public class FrogDistance {
	public static void main(String[] args) {
//		int distanceToWell = 6; // distance to well in meters
//		int totalDistance = 0; // initialize total distance covered
//		int numHops = 0; // initialize number of hops
////		int hopCount = 0;
//		while (totalDistance < distanceToWell) {
//			numHops++; // increment number of hops
//			if (numHops % 3 == 1) { // first hop covers 1 meter
//				totalDistance += 1;
//			} else if (numHops % 3 == 2) { // second hop covers 3 meters
//				totalDistance += 3;
//			} else { // third hop covers 5 meters
//				totalDistance += 5;
//			}
//		}
//
//		System.out.println("The frog reached to  the well in " + numHops + " hops.");
//
//	}
//}
//	      
		/*
		 * if distance is 6 then first hop is 1 second is 3, but third will not be
		 * completed so reminder will be 2
		 */
		int distanceToWell = 6;
		int numHops[] = { 1, 3, 5 };

		int totalHops = 0;
		for (int i = 0; i < numHops.length; i++) {
			totalHops += numHops[i];
			if (totalHops >= distanceToWell) {
				int remainder = distanceToWell - (totalHops - numHops[i]);
				System.out.println("The remainder is: " + remainder);

			}
		}
	}
}

