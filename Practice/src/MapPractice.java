import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapPractice {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("people", "사람");
		map.put("baseball", "야구");

		System.out.println(map.getOrDefault("peopl", "java"));
		
		System.out.println(map.containsKey("people"));
		
		System.out.println(map.remove("people"));
		
		System.out.println(map.size());
		
		System.out.println(map.keySet());
		
		List<String> keyList = new ArrayList<>(map.keySet());
		
	}

}
