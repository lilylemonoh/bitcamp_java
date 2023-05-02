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
			int from = scan.nextInt();
			int to = scan.nextInt();
			int tmp = 0;
			
			
			while(from < to) {
			tmp = result[from-1];
			result[from-1] = result[to-1];
			result[to-1] = tmp;
			from++;
			to--;
			}
			
		}
		
		for(int i = 0; i < result.length; i++) {
			System.out.printf("%d ", result[i]);
		}
		
		
		scan.close();
		

	}

}
