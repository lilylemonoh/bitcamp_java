package example.encap.bad;

public class MainClass {
	public static void main(String[] args) {
		// 같은 패키지 내부 클래스 파일을 가져다 쓸 때는 import 구문 필요 없음
		MyBirthday b = new MyBirthday();
		
		b.year = 3032;
		b.month = 13; 
		b.day = 34; // 말도 안 되는 숫자를 집어 넣어도 동작함
		
		b.showDateInfo();
		
	}
	
}
