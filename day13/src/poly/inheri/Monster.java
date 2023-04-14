package poly.inheri;

public class Monster {
	
	// 모든 몬스터 클래스의 부모로 설계
	private String name; // 온갖 타입을 다 받을 수 있는 다형성 특성상 몬스터 종류 식별용
	private int hp;
	private int atk;
	private int def;
	private int exp;
	
	// 부모쪽 생성자를 초기화할 때 어떤 몬스터가 생성될지 사전에 알 수 없으므로
	// 고정값이 아닌 입력자료를 받아 처리해야 하기 때문
	public Monster(String name, int hp, int atk, int def, int exp) {
		this.name = name;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
		this.exp = exp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}
	
	// 몬스터 사망 여부 판단. 죽었으면 true
	public boolean isInactive() {
		return this.hp <= 0 ? true : false; // return this.hp >0 ? false : true; (강사님 코드)
	}
	
	// 다음 공격에 몬스터가 죽는지 판단 - 내가 짠 코드 (강사님 피드백)
//	public boolean isInactiveAfterNextAttack(Warrior warrior) {
//		return this.hp - warrior.getAtk() > 0 ? false : true;
//	} 
	// 공격력만 넘기면 되는 상황이라서 warrior 객체를 다 넘길 필요는 없다. 
	
	public boolean isInactiveAfterNextAttacked(int userAtk) {
		return this.hp - userAtk <= 0 ? true : false;
	} // 고치기 전(Warrior 클래스) : monster.getHp() - this.atk <= 0
	
	
	// 공격받은 후의 hp를 자동으로 계산해주는 메서드
	// setter는 자료형 거의 대부분 void(리턴 자료 있으면 안 됨)
	public void setAtferAttackedHp(int userAtk) {
		this.hp = this.hp - (userAtk - this.def);
	} // 고치기 전(Warrior 클래스) : monster.getHp()-(this.atk - monster.getDef())
	
	
	
	

}
