package day06;

import java.util.Scanner;

public class Main {

//	********* 09
//	 *******  17
//	  *****   25
//	   ***    33
//	    *     41	
//	   ***    33
//	  *****   25
//	 *******  17
//	********* 09
	// n = 5
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i = 1; i <= n; i++) { //i=12345
			for(int j = 0; j < i-1; j++) {
				System.out.print(" ");
			}
			for(int k = (n+1-i)*2-1; k >= 1 ; k--) { // 97531
				System.out.print("*");
			}
			System.out.println();
		}
		for(int m = 1; m <= n; m++) { //m = 12345
			if(m == 1) continue;
			for(int z = n; z-1 >= m ; z--) { //n= 5 4 3 2 1 반복 : 4 3 2 1 0
				System.out.print(" ");
			}
			for(int o = 1; o <= m*2-1 ; o++ ) { //o=12345 반복: 13579
				System.out.print("*");
			}
				System.out.println();
		}

	}//main의 끝

}
