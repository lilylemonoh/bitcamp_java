package baekJoon;

import java.util.Scanner;

public class Num25304 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int total = scan.nextInt(); // 총금액
		int kind = scan.nextInt(); // 반복문 돌릴 횟수
		
		int sum = 0;
		for(int i = 0; i < kind*2; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			sum += a*b;
		}
		if(total == sum) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		

	}

}
