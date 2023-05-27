package bronze.one;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Num1157_adv {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String word = scan.next().toUpperCase();
		
		Map<Character, Integer> alphabet = new HashMap<>();
		
		for(int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			alphabet.put(c, alphabet.getOrDefault(c, 0)+1);
			// alphabet 맵에 c라는 key에 alphabet.getOrDefault(c, 0)+1라는 value를 저장함
			// getOrDefault는 c의 키가 있으면 value를 가져오고, 아니면 디폴트 0
			// 가져오거나 0을 가져와서 1을 더하는 것임
	
		}
		
		int maxCount = 0;
		char maxChar = '?';
		
		for(Map.Entry<Character, Integer> entry:alphabet.entrySet()) {
			// 반복문. entry라는 변수를 선언하고 alphabet.entrySet()의 결과를 순회함.
			// 각 반복문에서 entry 변수는 현재 요소를 나타냄 - 현재 알파벳과 그에 해당하는 개수
			// Map.Entry<c,i> 형식으로 각 entry의 요소가 표현됨.
			char c = entry.getKey();
			int count = entry.getValue();
			
			if( count > maxCount) {
				maxCount = count;
				maxChar = c;
			} else if (count == maxCount) {
				maxChar = '?';
			}
		}
		
		System.out.println(maxChar);
		
		scan.close();
		
		
	}

}
