package bronze.two;

import java.util.Scanner;

public class Num2675 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int testCase = scan.nextInt(); //실행횟수
		
		for(int i = 0; i < testCase; i++) {
			int repeatNumber = scan.nextInt();
			String inputString = scan.next();
			for(int j = 0; j < inputString.length(); j++) { // 3개 3번 반복
				for(int p = 0; p < repeatNumber; p++) {
					System.out.print(inputString.charAt(j));
				}
			}
			System.out.println();
		}
	}
}
