package baekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class Num2587 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] a = new int[5];
		
		for(int i = 0; i < 5; i++) {
			a[i] = scan.nextInt();
		} // 배열에 초기화
		Arrays.sort(a);
		
		int avg = (a[0]+a[1]+a[2]+a[3]+a[4])/5;
		int mid = a[2];
	
		System.out.println(avg);
		System.out.println(mid);
		
		

	}

}
