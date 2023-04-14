package day03;

public class SwitchExample2 {
	
	public static void main(String[] args) {
		//앞서 배운 배열과 연동해서 코드를 작성해보겠습니다.
		
		String[] food = {"떡볶이", "초밥", "꿔바로우", "팟타이", "타코"};
		
		//0 ~ 4 범위 난수를 얻도록 해주세요
		int idx = (int)(Math.random()*5);
		
		switch(food[idx]) {
			//여러분들이 최애 3개 요리는 case에서 체크해서
			// "XX식입니다"라고 출력하게 해주시고
			// 나머지 2개가 걸린 경우는 default문을 이용해 "기타요리입니다" 라고 출력해주세요.
		
		case "떡볶이" : 
			System.out.println("한식입니다");
			break;
		case "초밥" :
			System.out.println("일식입니다");
			break;
		case "꿔바로우" :
			System.out.println("중식입니다");
			break;
		default : 
			System.out.println("기타요리입니다");
		} //switch의 끝
		
				
	}
}
