
public class Jj253 {

	public static void main(String[] args) {

		Buyer b = new Buyer();
		Tv1 t = new Tv1();
		Computer c = new Computer();
		
		b.buy(t);
		b.buy(c);
		
		System.out.println("현재 남은 돈은 " + b.money + "만 원입니다.");
		System.out.println("현재 보너스점수는 " + b.bonusPoint + "점입니다.");
		
	} //main 끝
}


class Product {
	int price; // 제품의 가격
	int bonusPoint; // 제품구매 시 제공하는 보너스점수
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0); // 보너스 점수는 제품 가격의 10%
	}
	
}
class Tv1 extends Product {

	Tv1() {
		// 조상클래스의 생성자 Product(int price)를 호출한다.
		super(100); //Tv의 가격을 100만 원으로 한다.
	}
	
	// Object클래스의 toString()을 오버라이딩한다.
	public String toString() {	return "TV"; 	}
	
}

class Computer extends Product {

	Computer() { super(200); }
	
		public String toString() { 	return "Computer";	}
	}

class Buyer { // 고객, 물건을 사는 사람;
	int money = 1000; // 소유금액
	int bonusPoint = 0; //보너스점수
	Product[] cart = new Product[10]; // 구입한 제품을 저장하기 위한 배열(카트)
	int i = 0; //Product 배열 cart에 사용될 index
	
	void buy(Product p) {
		if (money < p.price) { 		
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		// Buyer가 가진 돈(money)에서 제품의 가격(p.price)만큼 뺀다.
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart[i++] = p;
		System.out.println(p + "을/를 구입하셨습니다.");
	}
}


