package arrayList;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
//****************java ArrayList Serialization and Deserialization ******
import java.util.ArrayList;

public class Test5 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Chandrakant");
		al.add("Charlie");
		al.add("Chandu");
		al.add("Pintu");
		try {
			// serialization
			FileOutputStream fos = new FileOutputStream("File");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(al);
			fos.close();
			oos.close();
			// Deserialization
			FileInputStream fis = new FileInputStream("File");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList list = (ArrayList) ois.readObject();
			System.out.println(list);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
