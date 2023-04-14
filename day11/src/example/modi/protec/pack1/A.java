package example.modi.protec.pack1;

public class A {

	/*
	 * protected는 다른 패키지일지라도 양 클래스가 부모 자식관계라면
	 * 제한적으로 접근을 허용해 줍니다.
	 */
	
	protected String s; //멤버변수
	
	protected A() {} //생성자
	
	protected void method() {} //메서드
	
}
