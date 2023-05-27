package booknumber2.chapter14;

import java.util.Arrays;

public class Example {

	// 모든 메서드는 클래스에 포함되어야 한다.
	int method(int i) {
		return (int)(Math.random()*5)+1;
	}
	
	int sumArr(int[] arr) { // sumArr는 int배열 arr를 매개변수로 하는 메서드 
		int sum = 0; //sum을 선언 후 0으로 초기화
		for(int i : arr) // 향상된 for문, arr의 각 요소가 한개씩 불려와서 아래 식이 실행된다.  
			sum += i; // 반복문.  
		return sum;	// 결과 출력
	}
	
	public static void main(String[] args) {
		int[] arr = new int[5];
		Arrays.setAll(arr, (i) -> (int)(Math.random()*5)+1);

//		System.out.println(Arrays.toString(arr));
		
	// 메서드 max가 선언된 MyFunction 인터페이스 정의
	@FunctionalInterface
	interface MyFunction {
		public abstract int max(int a, int b);
	}
	
	// 위 인터페이스를 구현한 익명클래스의 개체
//	MyFunction mf = new MyFunction() {
//		public int max(int a, int b) {
//			return a > b ? a : b;
//		}
//	};
	
	// 람다식으로 구현해보기
	MyFunction mf = (int a, int b) -> a > b ? a : b;

	int big = mf.max(5, 3);
	
	@FunctionalInterface 
	interface MyFunction2 {
		void myMethod(); // 추상 메서드
	}
	
//	void aMethod(MyFunction2 f) { // 매개변수의 타입이 함수형 인터페이스
//		f.myMethod();
//	}
//	Myfunction2 f = () -> System.out.println("myMethod()");
//	aMethod(f);
	

		
		
	}

}
