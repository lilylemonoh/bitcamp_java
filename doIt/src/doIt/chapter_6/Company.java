package doIt.chapter_6;

public class Company {
	private static Company instance = new Company(); // 유일하게 생성한 인스턴스
	private Company() {}
	
	public static Company getInstance() {
		if(instance == null) { // 인스턴스를 외부에서 참조할 수 있도록 구현
			instance = new Company();
			
		}
		return instance; // 유일하게 생성한 인스턴스 반환
	}
	
}
