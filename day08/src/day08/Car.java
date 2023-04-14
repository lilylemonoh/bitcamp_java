package day08;

public class Car {
	// 멤버변수, 필드
	public String modelName; //차종
	public int maxPassengers; //최대승객수
	public int currentSpeed; //속도
	public String owner; //차주
	public int gas; //연료량

	// 상수 선언은 final static으로 선언하면 됩니다.
	public final static int BOOST_SPEED = 10; 
	public final static int BREAK_SPEED = 10; 
	

	
	// 생성자 들어갈 자리    // 파라미터, 매개변수
	public Car(String mN, int mP, int cS, String own, int g) {
		modelName = mN;
		maxPassengers = mP;
		currentSpeed = cS;
		owner = own;
		gas = g;
	}
	//생성자를 이용하면 기본값을 배정할 수도 있다. (속도: 0, 가스:100으로 하면 3개 값만 입력받을 수 있음)
	
	// 가속기능
	public void accelerate() {
		currentSpeed += BOOST_SPEED;
	}
	
	// 감속기능
	public void break_() {
		currentSpeed -= BREAK_SPEED;
	}
	
	
	// 계기판 조회
	public void showStatus() {
		System.out.println("차종 : " + modelName);
		System.out.println("최대승객수 : " + maxPassengers);
		System.out.println("속도 : " + currentSpeed);
		System.out.println("차주 : " + owner);
		System.out.println("연료량 : " + gas);
	}
	
	
	
}
