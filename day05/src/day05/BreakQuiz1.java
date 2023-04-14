package day05;
import java.util.Scanner;
public class BreakQuiz1 {

	public static void main(String[] args) {
		// 1. 난수 2개를 발생시켜 주세요. 단, 난수는 1 ~ 10 범위로 두 개 만들어 주세요.
		// 2. while문을 무한루프로 만들어 주시고, 위에서 발생된 난수 2개를
		// 		a*b의 답은? 이라고 질문해서 문제를 출제하게 해 주세요
		// 3. if문으로 비교해 정답 시 break로 루프문을 빠져나오고
		//		오답인 경우 "오답입니다" 라는 멘트와 함께 답을 재입력받도록 해주세요.
		Scanner scan = new Scanner(System.in);
		int answer = -1;
		
		int leftNum = (int)(Math.random()*10) + 1;
		int rightNum = (int)(Math.random()*10) + 1;
		


				
		while(true) {
			System.out.println(leftNum + " * " + rightNum + "의 답은?");			
			answer = scan.nextInt();
			
			if(answer == (leftNum*rightNum)) {
				System.out.println("정답입니다.");
				break;
			}
			else {
				System.out.println("오답입니다. 다시 풀어보세요.");
			}
		} //while의 끝
		
		scan.close();
		
		

				

	}

}
