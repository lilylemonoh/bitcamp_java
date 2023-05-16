package java_review.api.lang;

import java.util.Scanner;

public class StringIndexOfQuiz {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("전체 문장을 입력해주세요");
		String sentence = scan.nextLine();
		
		System.out.println("찾을 단어를 입력해주세요.");
		String targetVoca = scan.next();
		
		int count = 0;
		int nextSearchIdx = 0;
		int lastSearchedIdx = 0;
		boolean flag = true;
		System.out.println(sentence + "에서 " + targetVoca + "를 찾습니다.");
		while(flag) {
			lastSearchedIdx = sentence.indexOf(targetVoca, nextSearchIdx);
			if(lastSearchedIdx == -1) {
				System.out.println("단어 찾기가 종료되었습니다.");
				flag = false;
			}else {
				System.out.println("단어 감지 인덱스 : " + lastSearchedIdx);
				nextSearchIdx = lastSearchedIdx + 1;
				count += 1;
			}
			
		}
		System.out.println(targetVoca+ "의 개수는 " + count + "개 입니다.");
		scan.close();
	}

}
