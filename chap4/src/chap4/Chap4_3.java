package chap4;

public class Chap4_3 {

	public static void main(String[] args) {
		int treeHit2 = 0;
		while (treeHit2 < 10) {
			treeHit2++;
			System.out.println("나무를 " + treeHit2 + "번 찍었습니다.");
		}
		if (treeHit2 == 10) {
			System.out.println("나무 넘어갑니다.");
		}

//		while(true) {
//			System.out.println("Ctrl-C를 눌러야 while문을 빠져 나갈 수 있습니다.");
//		}
		
		int coffee2 = 10;
		int money2 = 300;
		
		while (money2 > 0) {
			System.out.println("돈을 받았으니 커피를 줍니다.");
			coffee2--;
			System.out.println("남은 커피의 양은 " + coffee2 + "입니다.");
			if(coffee2 == 0) {
				System.out.println("커피가 다 떨어졌습니다. 판매를 중지합니다.");
				break;
			}
		}
		
		int a2 = 0;
		while( a2 < 10) {
			a2++;
			if (a2 % 2 == 0) {
				continue;
			}System.out.println(a2);
		}
		
		
		
		
	}

}
