import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ListPractice {

	public static void main(String[] args) {
//		ArrayList pitches = new ArrayList();
//		pitches.add("138");
//		pitches.add("129");
//		pitches.add("142");
//
//		pitches.add(0, "133");
//		pitches.add(1,"133");
//		System.out.println(pitches.get(1));
//		System.out.println(pitches.size());
//		System.out.println(pitches.contains("142"));
//		System.out.println(pitches.remove("129"));
//		System.out.println(pitches.remove(0));
//		
//		String one = (String)pitches.get(0);
//		System.out.println(one);
		
//		ArrayList<String> pitches1 = new ArrayList<>();
//		pitches1.add("138");
//		pitches1.add("129");
//		
//		String one1 = pitches1.get(0);
//		String two = pitches1.get(1);
//		System.out.println(pitches1);
		
//		String[] data = {"138", "129", "142"};
//		ArrayList<String> pitches = 
//				new ArrayList<>(Arrays.asList(data));
//		System.out.println(pitches);
		
//		ArrayList<String> pitches = 
//				new ArrayList<>(Arrays.asList("138", "129", "142"));
//		String result ="";
//		for(int i = 0; i < pitches.size(); i++) {
//			result += pitches.get(i);
//			result += ","; // 콤마를 추가한다.
//		}
//		result = result.substring(0, result.length() - 1); 
//		// 마지막 콤마는 제거한다.
//		System.out.println(result);
		
//		ArrayList<String> pitches =
//				new ArrayList<>(Arrays.asList("138", "129", "142"));
//		String result = String.join(",", pitches);
//		System.out.println(result);
		
//		String[] pitches = new String[] {"138", "129", "142"};
//		String result = String.join(",", pitches);
//		System.out.println(result);
		
		ArrayList<String> pitches = 
				new ArrayList<>(Arrays.asList("138", "129", "142"));
		pitches.sort(Comparator.naturalOrder());
		System.out.println(pitches);
	
		
		
		
		
	}

}
