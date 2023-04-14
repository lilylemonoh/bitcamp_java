package poly.hetero;

public class MainClass {

	public static void main(String[] args) {
		// 기본형 자료형으로 만든 배열 예시
		// 다른 자료형을 넣을 수 없음.
		// int[] iarr = {1, 2, "가"}
		
		// A자료형의 힙 주소를 배열로 저장 가능함
		A[] aArr = new A[2];
		
		A a1 = new A();
		A a2 = new A();
		
		aArr[0] = a1;
		aArr[1] = a2;
		
		Object[] oArr = new Object[2];
		
		B b1 = new B();
//		aArr[1] = b1; // A타입 배열에 B타입 대입
		oArr[0] = b1;  // 오브젝트 타입 배열에 B타입, A타입 대입 가능
		oArr[1] = a1;
		
		oArr[1] = 10; // 기본형 자료도 대입 가능
		

	}

}
