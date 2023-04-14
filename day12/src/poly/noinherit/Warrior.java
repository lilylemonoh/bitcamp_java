package poly.noinherit;

public class Warrior {
	// 정보은닉 적용
	private String id;
	private int hp;
	private int atk;
	private int def;
	private int exp;

	// 생성자를 만들어 주세요. id만 입력받고
	// 나머지는 체력은 20, 공격력 3, 방어력 1, 경험치 0으로 고정합니다.
	
	public Warrior(String id) {
		this.id = id;
		this.hp = 20;
		this.atk = 3;
		this.def = 1;
		this.exp = 0;
	}
	
	// 캐릭터 상태가 조회 가능한 showStatus()를 만들겠습니다.
	// 이 메서드는 멤버변수 정보를 콘솔에 찍어줍니다.
	public void showStatus() {
		System.out.println("아이디 : " + this.id);
		System.out.println("체력 : " + this.hp);
		System.out.println("공격력 : " + this.atk);
		System.out.println("방어력 : " + this.def);
		System.out.println("획득경험치 : " + this.exp);
		System.out.println("-------------------");
	}
	
	// 단독적으로 사냥을 하도록 메서드를 만듭니다.
	public void huntRabbit(Rabbit rabbit) {
		if(rabbit.getHp() <= 0) {
			System.out.println("이미 죽어서 공격할 수 없습니다.");
			return; // 이미 죽은 토끼는 아래 로직을 실행할 필요 없음
		}
		// 1. 내가 공격한 rabbit의 체력을 3 깎습니다.
		rabbit.setHp(rabbit.getHp() - this.atk);
		if(rabbit.getHp() <= 0) {
			System.out.println("토끼를 죽였습니다.");
			this.exp += 5;
		}else {
			System.out.println("토끼를 공격했습니다.");
		}
//		rabbit.hp -= this.atk; // private이라 접근 불가. getter와 setter 사용해야 함.
		
		
		
	}
	// huntRat을 개선해서, Rat 객체를 지정해 공격하도록 해주세요.
		
	// 공격받고도 안 죽으면 나도 반격당해서 rat.atk만큼 체력 차감
	public void huntRat(Rat rat) {
		// 죽었는지 안 죽었는지 검사
		if(!rat.isActive()) { // 유지보수 전 : (rat.getHp() <= 0)
			System.out.println("이미 죽어서 공격할 수 없습니다.");
			return;
		}
		// 안 죽었다면 죽을지 먼저 검사
		// 내 공격을 받고 Rat이 죽었다면 경험치 올리고 반격 안 받음
		if(!rat.isAttackedActive(atk)) { // 유지보수 전 : (rat.getHp() <= this.atk)
			rat.setDamagedHP(atk);       // 유지보수 전 : rat.setHp(rat.getHp() - this.atk);
			System.out.println("쥐를 죽였습니다.");
			this.exp += 80;			
		}
		// 공격받고도 안 죽으면 나도 반격당해서 rat.atk만큼 체력 차감
		else {
			rat.setHp(rat.getHp() - this.atk); // rat.setDamagedHP(atk); 로 유지보수 가능함
			this.hp -= rat.getAtk();
			System.out.println("쥐를 공격하고, 반격받았습니다.");
			
		}
	}
	// 추후 죽었는지 판단하는 메서드, 공격을 받고 살아있는지 판단하는 메서드를 Rat에 추가하여 유지보수하였음.
	
	public void huntPig(Pig pig) {
		if(!pig.isActive()) {
			System.out.println("이미 죽어서 공격할 수 없습니다.");
			return; 		
			}
			if(!pig.isAttackedActive(atk)) { 
				pig.setHp(pig.getHp() - (this.atk-pig.getDef()));       
			System.out.println("돼지를 죽였습니다.");
			this.exp += 120;			
		}
		else {
			pig.setHp(pig.getHp() - (this.atk-pig.getDef())); 
			this.hp -= pig.getAtk();
			System.out.println("돼지를 공격하고, 반격받았습니다.");
		}
	}
			
	public void huntGhost(Ghost ghost) {
		if(!ghost.isActive()) {
			System.out.println("이미 죽어서 공격할 수 없습니다.");
			return; 		
			}
			if(!ghost.isAttackedActive(atk)) { 
				ghost.setHp(ghost.getHp() - (this.atk-ghost.getDef()));       
			System.out.println("고스트를 죽였습니다.");
			this.exp += 150;			
		}
		else {
			ghost.setHp(ghost.getHp() - (this.atk-ghost.getDef())); 
			this.hp -= ghost.getAtk();
			System.out.println("고스트를 공격하고, 반격받았습니다.");
		}
	}
			

		
		
		
	
}
