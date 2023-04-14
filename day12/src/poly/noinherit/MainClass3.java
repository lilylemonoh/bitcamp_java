package poly.noinherit;

public class MainClass3 {
	
	public static void main(String[] args) {
		// Rat도 2마리 만들어서 한마리를 사냥하는 상황도 만들어 주세요
		
		Rat r1 = new Rat();
		Rat r2 = new Rat();
		
		Warrior w1 = new Warrior("자바전사");
		
		w1.showStatus();
		
		w1.huntRat(r2);
		w1.huntRat(r2);
		w1.huntRat(r2);
		
		w1.showStatus();		
		
		
	}
}
