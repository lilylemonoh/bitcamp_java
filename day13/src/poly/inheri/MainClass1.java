package poly.inheri;

public class MainClass1 {

	public static void main(String[] args) {
		
//		Warrior w1 = new Warrior("자바전사");
		
		Magician m1 = new Magician("자바법사");
		
		Rabbit r1 = new Rabbit();
		Rat rat1 = new Rat();
		
		m1.showStatus();
		
		m1.hunt(r1);
		m1.hunt(r1);

		m1.showStatus();
		
		m1.hunt(rat1);
		m1.hunt(rat1);
		m1.castFireball(rat1);
		
		m1.showStatus();
		
	}

}
