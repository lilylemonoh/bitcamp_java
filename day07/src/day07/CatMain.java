package day07;

public class CatMain {

		// 고양이를 조회하는 용도로 사용할 전용 메서드를 작성해보겠습니다.
	public static void showCatInfo(Cat cat) {
	System.out.println("고양이 이름 : " + cat.name);
	System.out.println("고양이 나이 : " + cat.age);
	System.out.println("고양이 색깔 : " + cat.color);
	System.out.println("고양이 무게 : " + cat.weight +"Kg");
	}
	
	public static void main(String[] args) {
		// 고양이를 한 마리 생성해보겠습니다.
		Cat c1 = new Cat();		// 클래스 = 내가 만든 사설 자료형. //*100번지
		
		c1.name = "밥";
		c1.age = 2;
		c1.color ="검정색";
		c1.weight = 8.5F;
		//4줄 한줄로 만드는 방법 있음. 클래스 만들기?
	
		showCatInfo(c1);
		
		Cat c2 = new Cat();
		
		c2.name = "모건";
		c2.age = 1;
		c2.color ="흰색";
		c2.weight = 5.1F;
		
		showCatInfo(c2);
		
		Cat c3 = new Cat();
		
		c3.name = "블루";
		c3.age = 6;
		c3.color ="회색";
		c3.weight = 7.0F;
		
		showCatInfo(c3);
		
		// c2, c3를 새롭게 생성해주시고
		// 이 고양이들도 showCatInfo로 조회할 때
		// 메모리 구조가 어떻게 전개될지 직접
		// 그려보기까지 해주세요.
		// c1, c2, c3를 조회하는 각각의 순간
		// 3장의 메모리 구조 그림을 보내주세요.
	}

}
