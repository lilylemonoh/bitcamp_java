package bronze.one;

import java.util.Arrays;
import java.util.Scanner;

public class Num1157 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String targetWord = scan.next();
		String upperTargetWord = targetWord.toUpperCase();
		// 대문자로 다 바꾸기
		int[] alphabet = new int[26]; //알파벳 A부터 Z까지 몇 개인지 개수를 저장할 배열 생성
	
		
		// alphabet 배열에 순서대로 알파벳의 개수를 저장함
		for(int i = 0; i < targetWord.length();i++) {
			char c = upperTargetWord.charAt(i); // 
			int index = (int)c-65;
			alphabet[index]++;
		}
		
		int maxNum = alphabet[0]; // 개수를 비교할 변수
		int max = 0; // 최댓값이 몇 번째 있는지 저장할 변수
		for(int j = 1; j < alphabet.length; j++) {
			if(alphabet[j] > maxNum) {
				maxNum = alphabet[j]; // 개수가 가장 많으면 maxNum에 저장
				max = j; // maxNum이 alphabet의 몇 번째에 있는지 max에 저장
			}
		}// for문 끝
		
		Arrays.sort(alphabet); // 오름차순 정렬 후 
		if(alphabet[24] == alphabet[25]) { // 가장 마지막 개수 두 개가 같은지 비교
			System.out.println("?"); // 같으면 가장 많이 사용된 알파벳이 여러 개 존재하므로 ? 출력
		} else {
			System.out.println((char)(max+65)); // max에 아까 뺀 65를 더해서 (char) 형변환 후 출력
		}
		
		scan.close();

	}

}
