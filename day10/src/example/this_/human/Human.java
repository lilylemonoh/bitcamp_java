package example.this_.human;

public class Human {
	public String name;
	public int age;
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Human(String name) {
		this(name, -1); // 아래 주석처리된 코드로 대체 가능함
		// this.name = name;
		// this.age = -1;
	}
	
	public Human() {
		this("이름없음", -2);
		// this.name = "이름없음"
		// this.age = -1;
	}
		
	public void showInfo() {
		System.out.println("이름 :" + name + " , 나이 : " + age);
		
	}
		
	
}
