package baekJoon;

import java.util.Scanner;

public class Num10818 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[] arr = new int[N];		
		for(int i = 0;i < N; i++) {
			arr[i] = scan.nextInt();
		}
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 1; i < N; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}else if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.printf("%d %d", min, max);
		
		scan.close();


	}

}
