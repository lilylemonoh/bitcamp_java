package day06;

/*
 * 1. 여러분들이 임의로 실행문이 3줄 이상인 메서드를 만들어보세요.
하나는 int를 하나 입력받는 메서드로
하나는 입력받는 자료가 없는 메서드로
하나는 String과 int를 하나씩 입력받는 메서드로 구성해주세요.
 */

public class HomeworkMethodExample {

	public static int calcSquare(int x) {
		int square = 0;
		square = x * x;
		return square; 
	}
		
	public static void getCafeMenu() {
		System.out.println("아메리카노");
		System.out.println("카페라떼");
		System.out.println("아이스티");		
	}
		
	public static void nameAndAge(String name, int age) {
		System.out.println("이용자 정보");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
		
	
	
	
	
	
	
	public static void main(String[] args) {


	}

}
