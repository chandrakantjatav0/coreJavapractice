package arrayList;

//***************add/remove/removeall/clear******************8
import java.util.ArrayList;
import java.util.Iterator;

public class Test6 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Chinki");
		al.add("Rinki");
		al.add("Pinki");
		al.add("Sanki");
		System.out.println("List of the Girls : ");
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		} // remove
		al.remove(3);
		al.add("Janki");

		System.out.println("After removing sanki Girl : ");
		Iterator itr1 = al.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
			
		}
		al.retainAll(al);
		// remove all
		al.removeAll(al);
		al.add(null);
		System.out.println("All good girls go to hell : " + al);
		// clear
		al.clear();
		System.out.println("Rest in peace : " + al);
	}
}
