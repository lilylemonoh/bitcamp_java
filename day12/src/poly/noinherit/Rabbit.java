package poly.noinherit;

public class Rabbit {
	// 필드 : hp, atk, def
	private int hp;
	private int atk;
	private int def;
	
	// 생성자에서 각각 void 파라미터로 3, 0, 0으로 초기화
	public Rabbit() {
		this.hp = 3;
		this.atk = 0;
		this.def = 0;
	}
	
	// setter/getter 자동생성
	// alt + shife + s || 우클릭 -> source
	// Generate getters and setters 선택
	
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}
	

	
	

}
