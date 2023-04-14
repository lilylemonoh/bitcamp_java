package day08;

public class CarMain {

	public static void main(String[] args) {
		// 자동차를 한 대 생성해 주시고
		// 값은 연료 100, 속도 0, 나머지 요소는 자율적으로 초기화해 주세요.
		// 엑셀 3번 밟고, 계기판 조회, 브레이크 2번 밟고, 계기판 조회하는
		// 코드를 아래에 작성해주세요.
		
		Car c1 = new Car("BMW", 5, 0, "김차주", 100);

		
		
		// 반복문으로 작성해도 무방함;
		c1.accelerate();
		c1.accelerate();
		c1.accelerate();
		
		c1.showStatus();
		
		c1.break_();
		c1.break_();

		c1.showStatus();
	}

}
