package JavaJungSuk;

public class Jj276 {

}

class Outer1 {
	private int outerIV = 0;
	static int outerCV = 0;
	
	class InstanceInner {
		int iiv = outerIV; // 외부 클래스의 private 멤버도 접근 가능하다.
		int iiv2 = outerCV;
	}
	
	static class StaticInner {
		// 스태틱 클래스는 외부 클래스의 인스턴스 멤버에 접근할 수 없다.
//		int siv = outerIV;
		int scv = outerCV;
		}
	
	void myMethod() {
		int lv = 0;
		final int LV = 0; // HDK1.8부터 final 생략 가능
		
		class LocalInner {
			int liv = outerIV;
			int liv2 = outerCV;
			//외부 클래스의 지역변수는 final이 붙은 변수(상수)만 접근가능하다.
			int liv3 = lv; // JDk1.8부터 에러 아님
			int liv4 = LV; // OK			
		}	
	}
}
