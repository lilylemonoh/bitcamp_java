package example.override;

public class Student extends Human {
	
	public String major;
	
	// 오버라이드 메서드 위에 붙여줘야 했던 어노테이션
	// 어노테이션 안 붙여도 되지만, 붙이는 게 유지보수 측면에서 좋다.
	// 붙였을 때는 혹시 자기소개하기()부분에 오타가 나면 오류를 잡아줌
	// 안 붙였을 때는 오타를 잡아주지 않고, 새로운 매서드로 인식함.
	@Override
	public void 자기소개하기() { // 메서드 재정의(오버라이딩)는 상속한 메서드 내용까지 모두 다시 적어야 한다.
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("전공 : " + major);
	}

}
