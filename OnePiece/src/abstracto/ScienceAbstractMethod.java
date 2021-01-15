package abstracto;

import java.util.HashMap;

public class ScienceAbstractMethod extends Science {
	public void science(HashMap<String, String> hashMap) {
		if (hashMap.keySet().equals("Nami")) {
			System.out.println("Navigator");
		}
		if (hashMap.keySet().equals("Sanji")) {
			System.out.println("Cook");
		}

		if (hashMap.keySet().equals("Chopper")) {
			System.out.println("Doctor");
		}

		if (hashMap.keySet().equals("Robin")) {
			System.out.println("Archaeologist");
		}

		if (hashMap.keySet().equals("Brooke")) {
			System.out.println("Musician");
		}
		System.out.println("New Skill has been acquired");
	}
}
