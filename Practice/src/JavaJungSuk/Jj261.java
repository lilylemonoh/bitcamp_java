package JavaJungSuk;

public class Jj261 {
	public static void main(String[] args) {
	
		Unit[] group = {new Marine(), new Tank(), new Dropship()};
		
		for(int i = 0; i < group.length; i++)
			group[i].move(100, 200);
	}
}

abstract class Unit {
	int x, y;
	abstract void move(int x, int y);
	void stop(){ }	
}

class Marine extends Unit {
	void move(int x, int y) { 
		System.out.println(x + "" + y );
	}
	void stimpack() {}
}

class Tank extends Unit {
	void move(int x, int y) {
		System.out.println("" + x + y);
	}
	void changeMode() {}
}

class Dropship extends Unit {
	void move(int x, int y) {
		System.out.println("" + x + y);
	}
	void load() {}
	void unload() {}
	
}