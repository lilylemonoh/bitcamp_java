package bronze.two;

import java.util.Scanner;

public class Num2908_adv {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int firstNum = scan.nextInt();
		int secondNum = scan.nextInt();
		
		int firstNumBackwards = reverseNum(firstNum);
		int secondNumBackwards = reverseNum(secondNum);
		
		if(firstNumBackwards > secondNumBackwards) {
			System.out.println(firstNumBackwards);
		} else {
			System.out.println(secondNumBackwards);
		}

		scan.close();

	}
	//734
	private static int reverseNum(int num) {
		
		// 1. result 변수 초기화. 뒤집힌 숫자를 저장할 공간.
		
		int result = 0;
		
		// 2.입력받은 num이 0보다 클 때까지 반복문을 실행
		
		while(num > 0) {
			
		// 3. 입력받은 숫자를 10으로 나누어가면서 각 자리 숫자를 뒤에부터 가져오기
		// 3-1.	result에 10을 곱하고, num을 10으로 나눈 나머지를 더하는 방식
		// 3-2. 이렇게 하면 num의 가장 오른쪽자리 숫자가 result의 가장 왼쪽 자리로 이동함
			
			result = result * 10 + num % 10; // 4 //40+3 // 430 + 7
			
		// 3-3. num을 10으로 나누어 다음자리 숫자를 가져오기	
			num /= 10; //73 // 7 // 0 // 모든 자리 숫자를 가져왔을 때 반복문 종료
		}
		// 최종적으로 뒤집은 결과 반환
		return result; //4 //43 //437
	}
	
}
