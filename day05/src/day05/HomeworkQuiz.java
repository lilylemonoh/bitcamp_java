package day05;

public class HomeworkQuiz {

	public static void main(String[] args) {
		// 중첩반복문을 이용해서
		// 4x + 5y = 60
		// 이 방정식의 양수 해를 모두 구하는 반복문을 작성해주세요.

		
		
		for(int x = 1; x <= 15 ; x++ ) {
			for(int y = 1; y <= 12 ; y++) {
				if((x*4) + (y*5) == 60) {
					System.out.println("x는 " + x + ", y는 " + y);					
				}				
			}
		}//외부 for문 끝
		
		
	}

}
