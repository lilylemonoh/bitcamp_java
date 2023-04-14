package poly.noinherit;

public class Ghost {

	private int hp;
	private int atk;
	private int def;
	
	
	public Ghost() {
		this.hp = 20;
		this.atk = 3;
		this.def = 2;
	}


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
	
	public boolean isActive() {
		return hp > 0 ? true : false;
	}

	// 공격받은 뒤에 살아있는지 죽었는지 체크
	public boolean isAttackedActive(int atk) {
		return (hp - atk) > 0 ? true : false;
	}
	
	// 공격받은 후의 hp를 자동으로 계산해주는 메서드
	public void setDamagedHP(int userAtk) {
		this.hp -= (userAtk - this.def);
	}
	
}
