package day04;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {

		/* 직급을 입력하세요.
		 * [사원, 대리, 과장, 차장, 부장] -> 200만원, 300만원, 400만원, 500만원, 600만원
		 * >
		 * 대리의 급여는 300만원입니다./
		 * or
		 * 사워은(는) 없는 직급입니다.
		 * 직급을 다시 입력해주세요.
		 */
			//스캐너를 생성해서 직급을 입력받을 수 있게 해주세요.
		
			Scanner scan = new Scanner(System.in);
			System.out.println("직급을 입력하세요");
			System.out.println("[사원, 대리, 과장, 차장, 부장]");
			
			String grade = scan.next();
			
			//입력받은 직급 확인
			switch(grade) {
			case "사원":
				System.out.println("사원의 급여는 200만원입니다.");
				break; 
			case "대리":
				System.out.println("대리의 급여는 300만원입니다.");
				break;
			case "과장":
				System.out.println("과장의 급여는 400만원입니다.");
				break; 	
			case "차장":
				System.out.println("차장의 급여는 500만원입니다.");
				break; 
			case "부장":
				System.out.println("부장의 급여는 600만원입니다.");
				break; 
			default:
				System.out.println(grade + "은(는) 없는 직급입니다.");
				System.out.println("직급을 다시 입력해주세요");
				break;
		}//switch~case문 닫는 부분 
			scan.close();	
	}//main method 닫는 부분

}//클래스 닫는 부분
