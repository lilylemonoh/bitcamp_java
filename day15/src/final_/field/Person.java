package final_.field;

public class Person {
	/*
	 * final 변수는 단 한 번 초기화될 수 있고
	 * 이후에는 변경이 불가능하기 때문에
	 * 선언 시에 아예 직접 초기화를 해주거나 (선언부 초기화)
	 * 혹은 생성자에서 초기화를 해주어야 합니다.
	 */
	
	public final String nationality = "대한민국"; //1.선언부 초기화
	public final String name; // 여기서 초기화 안 하면 2.무조건 생성자 초기화
	public int age; // final이 안 붙은 멤버변수는 초기화 의무 X
	
	public Person(String name) {
		this.name = name;
	}

}
