package hashSet;

import java.util.*;

class Vehicle {
	int quantity;
	String Brand, BikeName;
	float amount;

	public Vehicle(int quantity, String Brand, String BikeName, float amount) {
		this.quantity = quantity;
		this.Brand = Brand;
		this.BikeName = BikeName;
		this.amount = amount;
	}
}

public class Test3 {
	public static void main(String[] args) {
		HashSet<Vehicle> hs = new HashSet<Vehicle>();
		Vehicle v1 = new Vehicle(10, "TVs", "wego", 89000.f);
		Vehicle v2 = new Vehicle(9, "Honda", "Yunicorn", 139000.f);
		Vehicle v3 = new Vehicle(15, "Royal Enfield", "Bullet 350", 210000f);
		Vehicle v4 = new Vehicle(8, "Ola", "S1 Pro", 100000f);
		Vehicle v5 = new Vehicle(20, "Revolt", "RV400", 135000);
		hs.add(v3);
		hs.add(v2);
		hs.add(v1);
		hs.add(v5);
		hs.add(v4);
		for (Vehicle v : hs) {
			System.out.println(v.quantity + " " + v.Brand + " " + v.BikeName + " " + v.amount);
		}
	}
}
