import java.util.*;

public class HashMapPractice{
	public static void main (String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Alice", 25);
		map.put("Bob", 30);
		map.put("Charlie", 28);
		
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
		for (String key : map.keySet()) {
			System.out.println(key + ": " + map.get(key));
		}
		
		map.forEach((key,value) -> System.out.println(key + ": " + value));
		
	}
}