package poly.inheri;

public class Warrior {

	// 정보은닉 적용
	private String id;
	private int hp;
	private int atk;
	private int def;
	private int exp;
	
	
	public Warrior(String id) {
		this.id = id;
		this.hp = 20;
		this.atk = 3;
		this.def = 1;
		this.exp = 0;
	}
	
	public void showStatus() {
		System.out.println("아이디 : " + this.id);
		System.out.println("체력 : " + this.hp);
		System.out.println("공격력 : " + this.atk);
		System.out.println("방어력 : " + this.def);
		System.out.println("획득경험치 : " + this.exp);
		System.out.println("-------------------");
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
	
	// 그냥 Warrior 내부에서 적어도 되지만 코드 흐름을
	// 메서드 호출로만 제어하기 위해 분리
	public void gainMonsterExp(int monsterExp) {
		this.exp += monsterExp;
	}
	
	// 아래 Warrior 체력을 차감하는 로직을 메서드로 분리 및 재정의
	/*Warrior 내부를 고쳐주세요
	상대 공격력이 1 이상인 경우 워리어가 받는 최소 데미지가 1이 되고
	공격력이 0인 몬스터의 공격을 받아도 체력이 차지 않도록//
	로직을 고쳐주세요 */
	public void setHpAfterMonsterAttack(int monsterATK) {
		//내가 작성한 코드
//		if(monsterATK == 0) 
//			return;	
//		else if (monsterATK - this.def <= 0) { 
//			this.hp -= 1; 
//		} else {		
//		this.hp -= (monsterATK - this.def);
//		}
		
		if((monsterATK > 0) && (monsterATK - this.def) < 1) {
			this.hp -= 1;
		} else if (monsterATK == 0) {
			return;
		} else {
			this.hp -= (monsterATK - this.def);
		}
	}

	public void showMonsterAlreadyDeadMessage(String monsterName) {
		System.out.println("이 " + monsterName + " 은(는) 이미 죽어서 공격할 수 없습니다.");
	}
	
	public void showMonsterNowDeadMessage(String monsterName) {
		System.out.println(monsterName + " 이(가) 죽었습니다. 경험치를 획득했습니다.");
	}
		
	public void showMonsterCounterAttackMessage(String monsterName) {
		System.out.println(monsterName + " 을(를) 공격하였습니다." + monsterName + " 이(가) 반격을 했습니다.");
	}
	
	// 플레이어의 몬스터가 살아있을 때 실행하는 3줄의 로직을 1줄로 묶기 
	public void callUserAttackMonsterActive(Monster monster) {
		//if(monster.isInactiveAfterNextAttack(this)) { //(내가 짠 코드일 때) 
		// 워리어 내부에서 자기 자신을 받아야 하는 케이스			
		monster.setAtferAttackedHp(this.atk);
		//개선 전 : monster.setHp(monster.getHp()-(this.atk - monster.getDef()));
		gainMonsterExp(monster.getExp()); //개선 전 : this.exp += monster.getExp();
		showMonsterNowDeadMessage(monster.getName());
		//개선 전 : System.out.println(monster.getName() + " 이(가) 죽었습니다. 경험치를 획득했습니다.");	
	}

	
	// 파라미터로 모든 몬스터의 부모인 Monster를 선언하면
	// 다형성 원리에 의해서 상속받은 모든 몬스터가 대입 가능합니다.
	public void hunt(Monster monster) {
		// 죽은 몬스터는 교전 불가 및 종료
		if(monster.isInactive()) {		// 개선 전 monster.getHp() <= 0								
			showMonsterAlreadyDeadMessage(monster.getName());
			// 개선 전 :  System.out.println("이 " + monster.getName() + " 은(는) 이미 죽어서 공격할 수 없습니다.");
			return;
		}
		// 죽은 몬스터가 다음 공격에 죽으면 플레이어에게 경험치 부여
		if(monster.isInactiveAfterNextAttacked(this.atk)) { // 개선 전 monster.getHp() - this.atk <= 0
			callUserAttackMonsterActive(monster);
			// 3줄짜리 1줄로 바꿈. 메서드를 최대한 간단하게 만든다. 현업에서도 이런 방식으로 코드를 짠다.
			
			
		}
		// 몬스터가 다음 공격에 죽지는 않으면 반격해 플레이어 체력 차감
		else {
			monster.setAtferAttackedHp(this.atk); //개선 전 monster.setHp(monster.getHp()-(this.atk - monster.getDef()));
			setHpAfterMonsterAttack(monster.getAtk()); // 개선 전 : this.hp -= monster.getAtk();
			showMonsterCounterAttackMessage(monster.getName());
			// 개선 전 System.out.println(monster.getName() + " 을(를) 공격하였습니다." 
			//		+ monster.getName() +"이(가) 반격을 했습니다.");
		}
		
		
	}
	
	
	
}
