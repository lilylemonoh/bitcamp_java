package exception.runtime;

public class NullPointerExample {

	public static void main(String[] args) {
		
		String str = null;
//		str = "Hello";
		
		//toLowercase는 모든 문자열을 소문자로 만들어줍니다.
		System.out.println("아 이건 나오나?");
		System.out.println(str.toLowerCase());
		System.out.println("예외 특 : 발생한 지점에서 멈춤");
		
		
	}
}
