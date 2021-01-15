import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HashMap_Demo {
	/*
	 * TreeMap gives you strawhats in alphabetical order and that is order by key.
	 * Hashtable gives you HashMap with overhead for synchronization HashMap gives
	 * you just an output with no order by keys or values LinkedHashMap gives you
	 * the output exactly like the insertion order
	 */
	public static void main(String[] args) {
		LinkedHashMap<String, Strawhat> hashMap = new LinkedHashMap<>();
		Strawhat luffy = new Strawhat(1_500_000_000, 172.0, "Gum-Gum-Fruit");
		Strawhat zoro = new Strawhat(320_000_000, 172.0, "");
		Strawhat nami = new Strawhat(66_000_000, 172.0, "");
		Strawhat usopp = new Strawhat(200_000_000, 172.0, "");
		Strawhat sanji = new Strawhat(330_000_000, 172.0, "");
		Strawhat chopper = new Strawhat(100, 172.0, "Human-Human Fruit");
		Strawhat robin = new Strawhat(130_000_000, 172.0, "Flower-Flower Fruit");
		Strawhat franky = new Strawhat(94_000_000, 172.0, "");
		Strawhat brooke = new Strawhat(83_000_000, 172.0, "Revive-Revive Fruit");
		Strawhat jinbe = new Strawhat(438_000_000, 172.0, "");

		hashMap.put("Luffy", luffy);
		hashMap.put("Zoro", zoro);
		hashMap.put("Nami", nami);
		hashMap.put("Usopp", usopp);
		hashMap.put("Sanji", sanji);
		hashMap.put("Chopper", chopper);
		hashMap.put("Robin", robin);
		hashMap.put("Franky", franky);
		hashMap.put("Brooke", brooke);
		hashMap.put("Jinbe", jinbe);

		System.out.println(hashMap.size());

		System.out.println("[First Output Method]:");
		for (Entry<String, Strawhat> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey().toString() + " is a  " + entry.getValue());
		}

		System.out.println("____________________________________________________________________");
		System.out.println("[Second Output Method]:");

		for (String i : hashMap.keySet()) {
			System.out.println(i + " is a " + hashMap.get(i)); // or hashMap.values()
		}

		System.out.println("____________________________________________________________________");
		System.out.println("[Third Output Method]:");
		printMap(hashMap);
	}

	public static void printMap(Map<String, Strawhat> mp) {
		Iterator it = mp.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pairs = (Map.Entry) it.next();
			System.out.println(pairs.getKey() + " = " + pairs.getValue());
			it.remove(); // avoids a ConcurrentModificationException
		}
	}

}
