package bronze.two;

import java.util.Scanner;

public class Num10811 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numberOfBaskets = scan.nextInt();
		int tryCount = scan.nextInt();
		
		int[] result = new int[numberOfBaskets];
		for(int i = 0;i < result.length; i++) {
			result[i]=i+1;
		}
		// 배열 생성 및 초기화
		
		for(int i = 0; i < tryCount; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int tmp = 0;
			
			tmp = result[a-1];
			result[a-1] = result[b-1];
			result[b-1] = tmp;
			
			// 모르겠다..
		}
		
		for(int i = 0; i < result.length; i++) {
			System.out.printf("%d ", result[i]);
		}
		
		
		scan.close();
		

	}

}
