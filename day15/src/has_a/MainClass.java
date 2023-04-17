package has_a;

public class MainClass {

	public static void main(String[] args) {
		// Gun은 new 키워드로 생성해야 Police 생성자에 전달 가능
		Gun gun = new Gun("M-16", "369486");
		
		// gun을 사전에 생성하지 않으면 넘길 방법이 없음
		Police police = new Police(gun, "나경찰", 180);
		// 의존 관계. A가 먼저 존재해야 B를 만들 수 있는 케이스. Police는 gun에 의존한다. 
		// 스프링에서 '의존'을 심화해서 다루기 때문에 먼저 언급하심.
		
		//Police police = new Police(new Gun("M-16", "369486"), "나경찰", 180);
		// 이것도 가능하다. 익명 클래스 사용
		
		police.shoot();
		police.shoot();
		police.shoot();
		police.shoot();
		police.shoot();
		police.shoot();
	
		
	}

}
