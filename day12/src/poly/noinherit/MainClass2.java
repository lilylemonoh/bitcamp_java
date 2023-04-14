package poly.noinherit;

public class MainClass2 {

	public static void main(String[] args) {
		// rabbit 인스턴스 2개, warrior 인스턴스 1개를 생성해 주세요.
		
		Rabbit r1 = new Rabbit();
		Rabbit r2 = new Rabbit();
		
		Warrior w1 = new Warrior("김전사");
		
		w1.showStatus();
		
		w1.huntRabbit(r2);
		w1.huntRabbit(r2);		
		w1.huntRabbit(r2);
		
		w1.showStatus();

	}

}
