import java.util.Collections;
import java.util.LinkedList;

public class LinkedList_Demo {

	public static void main(String[] args) {
		LinkedList<String> strawhats = new LinkedList<>();
		strawhats.add("Luffy");
		strawhats.add("Zoro");
		strawhats.add("Nami");
		strawhats.add("Usopp");
		strawhats.add("Sanji");
		strawhats.add("Chopper");
		strawhats.add("Robin");
		strawhats.remove("Usopp");
		System.out.println(strawhats);
		strawhats.add("Franky");
		strawhats.add("Sogeking");
		strawhats.set(7, "Usopp");
		strawhats.add("Brook");
		strawhats.add("Jimbei");

		for (int i = 0; i < strawhats.size(); i++) {
			System.out.println("Member[" + i + "] = " + strawhats.get(i));
		}

		System.out.println();
		Collections.sort(strawhats);

		for (String eachStrawhat : strawhats) {
			System.out.println("Member[x] = " + eachStrawhat);
		}

		System.out.println();

	}

}
