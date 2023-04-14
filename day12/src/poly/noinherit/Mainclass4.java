package poly.noinherit;

public class Mainclass4 {

	public static void main(String[] args) {
		
		Pig p1 = new Pig();
		
		Ghost g1 = new Ghost();
		
		Magician m1 = new Magician("자바전사");
		
		m1.showStatus();
		

		m1.huntPig(p1);
		
		m1.showStatus();
		

	}

}
