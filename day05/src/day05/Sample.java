package day05;

interface Predator {	
	String getFood();
	
	default void printFood() {
		System.out.printf("my food is %s%n", getFood());
	}
	
	int LEG_COUNT = 4;
	
	static int speed() {
		return LEG_COUNT * 30;
	}
}

interface Barkable {
	void bark();
}

interface BarkablePredator extends Predator, Barkable {
	
}

class Animal {
	String name;
	
	void setName(String nM) {
		this.name = nM;
	}
}

class Tiger extends Animal implements Predator, Barkable {
	public String getFood() {
		return "apple";
	}
	
	public void bark() {
		System.out.println("어흥");
	}
}

class Lion extends Animal implements BarkablePredator {	
	public String getFood() {
		return "banana";
	}
	
	public void bark() {
		System.out.println("으르렁");
	}
}

class ZooKeeper {
	void feed(Predator pD) {
		System.out.println("feed "+pD.getFood());
	}
}

class Bouncer {
	void barkAnimal(Barkable animal) {
		animal.bark();
		}
	}

	


public class Sample {
	
	public static void main(String[] args) {

//		ZooKeeper bob = new ZooKeeper();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
//		bob.feed(girr);
//		bob.feed(reo);
		Bouncer bouncer = new Bouncer();
		bouncer.barkAnimal(tiger);
		bouncer.barkAnimal(lion);
		
	
	}//main의 끝

}
