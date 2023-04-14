package poly.inheri;

public class Magician {
	
	private String id;
	private int hp;
	private int atk;
	private int def;
	private int exp;

	Magician(String id) {
		this.id = id;
		this.hp = 20;
		this.atk = 2;
		this.def = 0;
		this.exp = 0;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
	
	public void showStatus() {
		System.out.println("아이디 : " + this.id);
		System.out.println("체력 : " + this.hp);
		System.out.println("공격력 : " + this.atk);
		System.out.println("방어력 : " + this.def);
		System.out.println("획득경험치 : " + this.exp);
		System.out.println("-------------------");
	}
	
	public void showMonsterAlreadyDeadMessage(String monsterName) {
		System.out.println(monsterName + "은(는) 이미 죽었습니다.");
	}
	
	public void showMonsterNowDeadMessage(String monsterName) {
		System.out.println(monsterName + "이(가) 죽었습니다. 경험치를 획득합니다.");
	}
	
	public void showMonsterCounterAttackMessage(String monsterName) {
		System.out.println(monsterName + "을(를) 공격했습니다. " + monsterName + "이(가) 반격했습니다.");
	}
	
	public void gainMonsterExp(int monsterExp) {
		this.exp += monsterExp;
	}
	
	public void setHpAfterMonsterAttack(int monsterAtk) {
		if (monsterAtk > 0 && (monsterAtk - this.def) <= 0  ) {
			this.hp -= 1;
		} else if (monsterAtk == 0) {
			return;
		} else {
			this.hp -= (monsterAtk - this.def); 
		}
			
	}
	
	//hunt 메소드를 Warrior에서 가져올 수는 없는지?
	
	
	
	public void hunt(Monster monster) {
		if(monster.isInactive()) {
			showMonsterAlreadyDeadMessage(monster.getName());
			return;
		}
		
		if(monster.isInactiveAfterNextAttacked(this.atk)) {
			monster.setAtferAttackedHp(this.atk);
			gainMonsterExp(monster.getExp());
			showMonsterNowDeadMessage(monster.getName());
		}
		else {
			monster.setAtferAttackedHp(this.atk);
			setHpAfterMonsterAttack(monster.getAtk());
			showMonsterCounterAttackMessage(monster.getName());
		}	
	}
	

	
	public void castFireball(Monster monster) {
		
		int DamageIncreaseRate = 2; 
		
		if(monster.isInactive()) {
			showMonsterAlreadyDeadMessage(monster.getName());
			return;
		}
		
		if(monster.isInactiveAfterNextAttacked(this.atk*DamageIncreaseRate)) {
			monster.setAtferAttackedHp(this.atk*DamageIncreaseRate);
			gainMonsterExp(monster.getExp());
			showMonsterNowDeadMessage(monster.getName());
		}
		else {
			monster.setAtferAttackedHp(this.atk*DamageIncreaseRate);
			setHpAfterMonsterAttack(monster.getAtk());
			showMonsterCounterAttackMessage(monster.getName());
		}	
	}
	
	
	
}
