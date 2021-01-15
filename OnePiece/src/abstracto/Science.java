package abstracto;

import java.util.HashMap;

abstract class Science {
	public abstract void science(HashMap<String, String> hashMap);

	public void learn() {
		System.out.println("This team Member has learned a new skill.");
	}
}
