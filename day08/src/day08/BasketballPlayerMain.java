package day08;

public class BasketballPlayerMain {
	public static void main(String[] args) {
		// 농구선수를 둘 만들어 주세요
		// 하나는 덩크슛에 성공하게
		// 하나는 실패하게 만들어 주세요.
		
		BasketballPlayer b1 = new BasketballPlayer("박농구", 189, 23, 3000000);
				
		BasketballPlayer b2 = new BasketballPlayer("김덩크", 200, 30, 2000000);
		
		
		b1.showInfo();
		
		b1.dunkShoot();
		
		b2.showInfo();
		
		b2.dunkShoot();
		
	}

}
