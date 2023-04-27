package bronze.three;

import java.util.Scanner;

public class Num10810 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numOfBaskets = scan.nextInt(); // 바구니 개수
		int tryCount = scan.nextInt(); // 시도 횟수
		
		int[] result = new int[numOfBaskets]; // 배열 생성
		
		/*
		 * arr 0~ arr 1을 3으로
		 * arr 2~ arr 3을 4로
		 * arr 1~ arr 1를 2로 
		 */
		for(int x=0; x < tryCount; x++) {
			int i = scan.nextInt(); //1
			int j = scan.nextInt(); //2 
			int k = scan.nextInt(); //3
			
			for(int y=i; y <= j; y++) {
				result[y-1] = k;
			}
			
		}
		
		for(int z=0; z < 5; z++ ) {
			System.out.print(result[z] + " ");
		}
		
		scan.close();
	}

}
