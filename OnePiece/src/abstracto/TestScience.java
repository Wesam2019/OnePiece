package abstracto;

import java.util.HashMap;

public class TestScience {

	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<>();
		hashMap.put("Luffy", "Captain");
		hashMap.put("Nami","Swan");
		ScienceAbstractMethod sam = new ScienceAbstractMethod();
		sam.science(hashMap);
	}

}
