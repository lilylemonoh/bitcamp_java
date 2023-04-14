package day09;

public class GarbageCollectorTest {

	public int objectNum; // 객체 번호
	
	// 생성자 (객체가 힙에서 생성되기 직전에 실행되는 메서드)
	public GarbageCollectorTest(int number) {
		objectNum = number;
		System.out.println(objectNum + "번 객체 생성");
	}
	
	// 소멸자 (객체가 힙에서 삭제되기 직전에 실행되는 메서드)
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println(objectNum + "번 객체가 힙에서 삭제됩니다.");
	 }
	
	// finalize() 메서드 오버라이딩 
	// 1.8버전 이전에는 오버라이드 어노테이션(@Override)을 붙였어야 실행되었음
	// 유지보수 측면에서 @Override를 명시적으로 써주는 것이 좋다.
	// 붙이면 컴파일러가 체크 못하는 오류(finalize 오타가 있는지 없는지) 체크해줌
}
