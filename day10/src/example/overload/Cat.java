package example.overload;

public class Cat {

	public String kind;
	public String name;
	
	public Cat() { // void 생성자 : 파라미터에 입력된 자료가 없는 경우
		kind = "종을 입력해주세요";
		name = "이름을 지어주세요";
	}
	
	public Cat(String k,String n) {
		kind = k;
		name = n;		
		System.out.println("지금부터 이 아이의 이름은 "+ n + "입니다.");
	}
	
	public void call() { // void 파라미터 메서드
		System.out.println("야옹아 이리와");
	}

	public void call(String n) { // String 메서드
		System.out.println(n + "아 이리와");
	}
}
