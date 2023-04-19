package bronze.two;

import java.util.Scanner;

public class Num10804 {
	
	public static void main(String[] args) {
	
		int[] arr = new int[20];
		
		for(int i = 0; i <= 19; i++) {
			arr[i] = i+1;
		} // 배열에 초기화함
		
		Scanner scan = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		int tmp = 0;
		// 5,10 (b-a+1)가 짝수면? 2로 나눈 만큼(3번) 실행
		// (b-a+1)가 홀수면? 2로 나눈 만큼 실행. (나머지가 0.5라 날라감)
		// 바꾸기.
		// tmp = arr[4]; 
		// arr[4] = arr[9];
		// arr[9] = tmp;
		
		// a=5=arr[4] //  b=10= arr[9]
		
		for (int j = 0; j < 10; j++)
		{
			a = scan.nextInt();
			b = scan.nextInt();
		for(int i = a-1; i < a + ((b-a+1)/2); i++) {
			tmp = arr[i];
			arr[i] = arr[a+b-i-2]; //i는 4 5 6 // 9 8 7 // 15 -i
			arr[a+b-i-2] = tmp;
		}
		}
		
		
		
		for(int i = 0; i <= 18; i++) {
			System.out.printf("%d ", arr[i]);
		}
		System.out.print(arr[19]);
		
	}
}
