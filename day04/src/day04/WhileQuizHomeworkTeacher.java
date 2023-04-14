package day04;

import java.util.Scanner;

public class WhileQuizHomeworkTeacher {

	public static void main(String[] args) {
		
			int count = 1;
		
			Scanner scan = new Scanner(System.in);
					
			System.out.println("수의 최대값 범위를 입력해주세요.");
		
			int maxValue = scan.nextInt() + 1;
		
			int comValue = (int)(Math.random() * (maxValue));
					
				System.out.println("0 ~ " + (maxValue-1) +" 사이의 숫자를 입력해주세요.");
				
				
				// 자바에서는 연속해서 변수를 선언하는 것이 불가능하므로
				// 반복문 바깥에서 선언해주고, 반복문 내부에서는 선언된 변수 값을 바꿔넣기만 한다.
			int userValue = -1;
				
				do {
					 userValue = scan.nextInt();		
				} while((maxValue-1) < userValue || userValue < 0 );
						
					while(comValue != userValue) {
					count += 1;
						
					}if(comValue > userValue) {
						System.out.println("업입니다.");
					}else {
						System.out.println("다운입니다.");
					}
					System.out.println("다시 입력해주세요.");
				do {
						 userValue = scan.nextInt();		
					}
				while((maxValue-1) < userValue || userValue < 0 ); 
				
					
				//while의 끝
				
				System.out.println("정답입니다!");
				System.out.println("시도 횟수 : " + count);

}
}

			
			
//				<과제>
//
//				WhileQuiz를 개선해주세요.
//
//				1. 0~100인 범위를 0~사용자가 입력한 값으로 설정할 수 있게 코드를 고쳐주세요.  (몇부터 몇까지?? 최소값도 고칠 수 있으면 고쳐보기)
//
//				2. 위에 적힌 범위를 벗어나는 숫자가 들어오면 다시 입력받게 해주세요("범위 내의 숫자를 입력해주세요")
//
//				3. 몇 번 시도 끝에 맞췄는지 정답 확인 시 알려주도록 해주세요 ("%% 번 시도 끝에 정답을 맞췄습니다.")
				
				
	


