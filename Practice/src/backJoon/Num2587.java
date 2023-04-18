package backJoon;

import java.util.Scanner;

public class Num2587 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] a = new int[5];
		
		for(int i = 0; i < 5; i++) {
			a[i] = scan.nextInt();
		} // 배열에 초기화
		
		int avg = (a[0]+a[1]+a[2]+a[3]+a[4])/5;
		int mid = 0;
		
//		for 
		
		
		System.out.println(avg);
		System.out.println(mid);
		
		

	}

}
