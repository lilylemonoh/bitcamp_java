package example.this_.car;

public class Car {

	public String model;
	public int speed;
	
	public Car(String model) {
		this.model = model;
		this.speed = 0;
	} // this는 멤버변수를 지칭할 때 왼쪽에 붙여준다. 
	
	public void accel() {
		if(this.speed + 10 >= 150) {
			this.speed = 150;
		} else {
			this.speed += 10;
		}
	}// 메서드에서는 this 안 써도 됨.. 굳이 구분할 필요가 없으니까
	
	public void showStatus() {
		System.out.println("모델명 : " + model);
		System.out.println("현재속도 : " + speed);
	}
	
}
