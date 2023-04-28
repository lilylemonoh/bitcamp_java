package bronze.two;

import java.util.Arrays;
import java.util.Scanner;

public class Num3052 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] remainArr = new int [10];
		
		for(int i = 0; i < 10; i++) {
			int x = scan.nextInt();
			remainArr[i] = x%42;
		}
		Arrays.sort(remainArr);
		
		int count = 1;
		for(int j = 0; j < 9; j++) {
			if(remainArr[j]==remainArr[j+1]) {
				continue;
			}else {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
