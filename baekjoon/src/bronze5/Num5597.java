package bronze5;

import java.util.Scanner;

public class Num5597 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[31]; //arr[0]~arr[30]
		
		for(int i = 0; i < 28; i++) {
			int a = scan.nextInt();
			arr[a] = a;
		}
		
		for(int j = 1; j < 31; j++) {
			if(arr[j]==0)
		System.out.println(j);
		}
	}

}
