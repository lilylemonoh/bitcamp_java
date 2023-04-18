package exception.custom;
	
	/*
	 * 사용자 정의 예외 클래스를 만들려면 Exception 클래스나
	 * 혹은 RuntimeException 클래스를 상속받습니다.
	 */
public class BalanceInsufficientException extends RuntimeException{
	
	/*
	 * 일반적으로 사용자 정의 예외 클래스를 만들 때는
	 * 기본 생성자와 예외 원인 메시지를 받는 생성자를
	 * 두 개 오버로딩해서 선언만 해줍니다.
	 */
	
	public BalanceInsufficientException() {};
	
	public BalanceInsufficientException(String message) {
		super(message);
	}
	

	

}
