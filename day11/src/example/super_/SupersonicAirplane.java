package example.super_;
	// super 키워드는 부모쪽 생성자 호출할 때, (오버라이드 전)부모 쪽 메서드를 호출할 때 많이 쓴다.
public class SupersonicAirplane extends Airplane {

	// 상속받는 멤버변수 없음
	
	public SupersonicAirplane(String planeCode) {
		super(planeCode); // 현 구조에서는 Airplane의 생성자 호출
	}
	
	// 초음속 비행기도 fly()를 사용해야 하므로 오버라이딩을 합니다.
	// 다만 시속 900km 미만에서는 일반 비행을, 그 이후에는 초음속 비행을 하므로
	// 900km 이하 구간에서는 오버라이딩 전 fly()를, 이후에는 재정의된 fly()를 실행합니다.
	@Override
	public void fly() {
		if(this.speed < 900) {
			super.fly(); // 일반 비행 (부모쪽) // 아래는 속도가 900보다 클 때 오버라이딩한 것
		}else if(this.speed + 300 <= 2200 && this.gas >= 5) {
			this.speed += 300;
			this.gas -= 5;
		}else if (this.speed + 300 >= 2200 && this.gas >= 5) {
			this.speed = 2200;
			this.gas -= 5;
		}else {
			System.out.println("연료가 부족합니다.");
		}
	}
	
	
	
}
